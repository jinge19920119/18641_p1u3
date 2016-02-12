package driver;

import adapter.BuildAuto;
import util.FileIO;
/*
 * Name: Ge Jin
 * andrew id: gjin
 * date : jun 18, 2015
 */



public class Driver {
	public static void main(String[] args){
		
		BuildAuto ba= new BuildAuto();
		ba.BuildAuto("readFile1.txt");
		
		
		/*
		 * test for other functions
		 */
		ba.BuildAuto("readFile1+.txt");
		ba.printAuto("S90");
//		ba.updateOptionPrice("S90", "air bags", "none", 200);
		ba.updateOptionName("S90", "color", "cloud 9 white clearcoat","white");
//		ba.printAuto("S90");
		ba.updateOptionName("S90", "color", "white", "white1");
//		ba.printAuto("S90");
		ba.updateOptionName("S90", "color", "white1", "white2");
//		ba.printAuto("S90");
		ba.updateOptionName("S90", "color", "white2", "white3");
//		ba.printAuto("S90");
		ba.updateOptionName("S90", "color", "white3", "white4");
//		ba.printAuto("S90");
		
		
		for(int i=0;i<5000;i++){
			ba.updateOptionPrice("S90", "air bags", "none", 100);
		}
		
		ba.printAuto("S90");
	}
	

}
