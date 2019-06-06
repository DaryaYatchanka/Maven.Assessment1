package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    Pet[] pets;


    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if(pets!=null) {
            for (Pet p : pets) {
                p.setOwner(this);
            }
        }
        this.pets=pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if (pets==null){
            pets = new Pet[]{pet};
        }
       else{
            List<Pet> list = Arrays.asList(pets);
            list.add(pet);
            pets = list.toArray(pets);
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        if (pets==null){
            pets = new Pet[]{pet};
        }
        else{
            List<Pet> newPatName = new ArrayList<Pet>(Arrays.asList(pets));
             newPatName.remove(pet);


            pets = newPatName.toArray(pets);
        }


    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (int i = 0; i<pets.length; i++)
        if(pets[i].equals(pet)){
            return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int storeAge= pets[0].getAge();
        for (int i =0; i<pets.length; i++){
            if(pets[i].getAge()<storeAge){
                storeAge = pets[i].getAge();
            }
        }
        return storeAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int storeAge= pets[0].getAge();
        for (int i =0; i<pets.length; i++){
            if(pets[i].getAge()>storeAge){
                storeAge = pets[i].getAge();
            }
        }
        return storeAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int storeAge= 0;

        for (int i =0; i<pets.length; i++){

                storeAge+=pets[i].getAge();
            }

       return (float)storeAge/pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        int count = 0;
        for (int i =0; i<pets.length; i++) {
          count +=1;
        }
        return count;

    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return pets;
    }
}
