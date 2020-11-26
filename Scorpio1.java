/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadi;

import java.util.Scanner;

/**
 *
 * @author Len_Z50-70
 */
public class Scorpio1{
/*
    private String name;
    private int nomer;
    private Calendarf br;
    private double sr;

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        if (name1 != null) {
            this.name = name1;
        }
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer1) {
        if (nomer1 > 0) {
            this.nomer = nomer1;
        }
    }

    public Calendarf getBr() {
        return br;
    }

    public void setBr(Calendarf br1) {
        this.br = br1;
    }

    public double getSr() {
        return sr;
    }

    public void setSr(double sr1) {
        if (sr1 >= 2 && sr <= 6) {
            this.sr = sr1;
        }
    }

    public Studentf(String name1, int nomer1, double sr1) {
        this.setName(name1);
        this.setNomer(nomer1);
        this.setSr(sr1);
    }

    public Studentf() {
        this("Irina", 15, 6);
    }

    public int age(Calendarf br) {
        return 2020 - br.getGodina();
    }

    @Override
    public String toString() {
        return String.format("Ime:%s Nomer:%d Sreden uspeh:%.2f birthday:%d,%d,%d",
                getName(), getNomer(), getSr(), br.getDen(), br.getMesec(), br.getGodina());
    }

    public static void main(String[] args) {
        Studentf irina = new Studentf();
        irina.br = new Calendarf(10, 12, 2003);
        System.out.println(irina);
        System.out.println("Age: " + irina.age(irina.br));
    }
}
*/
private int legs;
private int poison;
private int length;
private int weight;
Scorpio1[] arrScorpio;
public int getLegs(){
	return legs;
}
public int getPoison(){
	return poison;
}
public int getLength(){
	return length;
}
public int getWeight(){
	return weight;
}
public Scorpio1[] getArrScorpio(){
	return arrScorpio;
}
public void setLegs(int legs){
	this.legs=legs;
}
public void setPoison(int poison){
	this.poison=poison;
}
public void setLength(int length){
	this.length=length;
}
public void setWeight(int weight){
	this.weight=weight;
}
public void setArrScorpio(Scorpio1[] newArrScorpio){
	arrScorpio = new Scorpio1[newArrScorpio.length];
	for(int i=0;i<arrScorpio.length;i++){
		arrScorpio[i]=newArrScorpio[i];
	}
	}
public Scorpio1(int legs1, int poison1, int length1, int weight1, Scorpio1[] arrScorpio1){
	this.setLegs(legs1);
	this.setPoison(poison1);
	this.setLength(length1);
	this.setWeight(weight1);
	this.setArrScorpio(arrScorpio1);
}
public Scorpio1(Scorpio1 s){
	this(s.getLegs(),s.getPoison(),s.getLength(),s.getWeight(),s.getArrScorpio());
}
public Scorpio1(){
	this(6,20,10,7,new Scorpio1[3]);
}
@Override
public String toString(){
String str="";
for(int i=0;i<arrScorpio.length-1;i++){
	str+=String.format("%d %d %d %d, ", getArrScorpio()[i]);
}
	str+=getArrScorpio()[arrScorpio.length-1];
	return "legs: " + getLegs() + "poison: " + getPoison() + "length: " + getLength() + "weight: " + getWeight() + str + "\n";
}
public void Input(Scorpio1[] newArrScorpio){
	Scanner input = new Scanner(System.in);
		for(int i=0;i<newArrScorpio.length;i++){
		newArrScorpio[i].legs=input.nextInt();
		newArrScorpio[i].poison=input.nextInt();
		newArrScorpio[i].length=input.nextInt();
		newArrScorpio[i].weight=input.nextInt();
	}
	}
public int count(int l){
	int count1=0;
	for(int i=0;i<arrScorpio.length;i++){
		if(arrScorpio[i].legs>=l)count1++;
	}
		return count1;
}
public static double main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scorpio1 obj = new Scorpio1();
        System.out.println("length: ");
        double len = input.nextDouble();

        for (int i = 0; i < obj.getArrScorpio().length; i++) {
            obj.getArrScorpio()[i] = new Scorpio1();

        }
        System.out.println(obj);
        return 0;
        
        
    }	
	
}
