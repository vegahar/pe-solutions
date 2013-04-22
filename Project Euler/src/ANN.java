package edu.ntnu.robocode.jsniper;

import edu.ntnu.robocode.jsniper.data.Position;
import edu.ntnu.robocode.jsniper.data.PositionData;
import edu.ntnu.robocode.jsniper.data.PositionList;

import org.encog.engine.network.activation.ActivationSigmoid;
import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataPair;
import org.encog.ml.data.MLDataSet;
import org.encog.neural.networks.BasicNetwork;
import org.encog.neural.networks.layers.BasicLayer;
import org.encog.neural.networks.training.propagation.back.Backpropagation;
import org.encog.persist.EncogDirectoryPersistence;

import java.io.File;



//Uses Encog library to implement ANN for prediction of next position based on recent ones.
public class ANN {
  BasicNetwork network;
    //Load ANN from file
    public ANN(String dirPath, String fileName) {
    	
    	//try loading the file
    	try {
    		EncogDirectoryPersistence dir = new EncogDirectoryPersistence(new File(dirPath));
    		network = (BasicNetwork)dir.loadFromDirectory(fileName);
		} catch (Exception e) {
			createNetwork(dirPath, fileName);
		}
    	
    	
    }
    public void createNetwork(String dirPath, String fileName){
    	BasicNetwork basiNet = new BasicNetwork();
    	
    	basiNet.addLayer(new BasicLayer(0));
    	basiNet.addLayer(new BasicLayer(new ActivationSigmoid(),false, 1));
    	basiNet.getStructure().finalizeStructure();
    	basiNet.reset();

    	MLDataSet dataSet =PositionData.toDataSet(Config.lookback);
    	Backpropagation train;
    	try {
			
    		train = new Backpropagation(basiNet, dataSet,Config.learningRate,Config.momentum);
    		train.fixFlatSpot(false);
        	while(train.getError() >= Config.error){
        		train.iteration();
        	}
        	//save network
        	EncogDirectoryPersistence dir = new EncogDirectoryPersistence(new File(dirPath));
        	dir.saveToDirectory(fileName, basiNet);
        	network = (BasicNetwork)dir.loadFromDirectory(fileName);
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    //Predict next position based on lookback previous positions
    public Position predict(PositionList positions, double width, double height) {
    	Position p = positions.get(positions.size()-1);
    	System.out.println(p.x + " " + p.y);
    	MLData a = network.compute(positions.toData());
         //returns the last observed position, you will need to return the next predicted position instead
    	double [] pos = a.getData();
    	return p;
    }
    
    
    public static void main(String[] args) {
    	String dirpath = "C:\\robocode\\jsniper_data\\";
    	String filename = "walls_data.ser";
    	ANN a = new ANN(dirpath, filename);
		
	}
}
