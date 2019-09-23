package com.lxy.prepare.interfaces;

public class PetShop {
	
	
	private Pet[] pets;
	private int index = 0;
	
	public PetShop(int length){
		if (length > 0) {
			pets = new Pet[length];
			
		}else{
			pets = new Pet[1];
		}
		
	}
	
	public void add(Pet p){
		if (index <= pets.length-1) {
			pets[index] = p;
		}else{
			Pet[] newPets = new Pet[pets.length+1];
			for (int i = 0; i < pets.length; i++) {
				newPets[i] = pets[i];
			}
			
			newPets[newPets.length-1] = p;
			pets = newPets;
		}

		index++;
	
		
	}
	
	public Pet[] selectKye(String key){
		Pet[] newPets = null;
		int length = 0;
		
		for (Pet pet : pets) {
		
			if (pet.getName().equals(key)||pet.getColor().equals(key)) {
				length++;
			}
		}
		newPets = new Pet[length];
		index = 0;
		for (Pet pet : pets) {
			if (pet.getName().equals(key)||pet.getColor().equals(key)) {
				newPets[index] = pet;
				index++;
			}
		}

		return newPets;
	}
	
	public void printInfo(Pet[] pets){
		for (Pet pet : pets) {
			System.out.println(pet.print());
		}
	}
	
	
	
	
	
	
	
}
