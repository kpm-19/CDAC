package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Car implements Serializable
{
	String carname;
	int model;

	public Car(String carname, int model) {
		super();
		this.carname = carname;
		this.model = model;
	}
	
	Car(){
		
	}
	@Override
	public String toString() {
		return "Car [carname=" + carname + ", model=" + model + "]";
	}

}

class Nano extends Car implements Serializable 
{
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	String colour;
	String type;

	public Nano(String carname, int model, String colour, String type) {
		super(carname, model);
		this.colour = colour;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Nano [carname=" + carname + ", model=" + model + "  colour=" + colour + ", type=" + type + "]";
	}

}

public class Demo2 {

	public static void main(String[] args) {
		Nano n = new Nano("nano", 666, "yellow", "f type");

		try (FileOutputStream fos = new FileOutputStream("D://kpp.txt")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(n);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("D://kpp.txt")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				
				Nano n1 = (Nano) ois.readObject();
				System.out.println(n1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
