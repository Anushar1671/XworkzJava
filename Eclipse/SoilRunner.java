package com.xworkz.Inheritance;

public class SoilRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in SoilRunner");
		
		Soil soil=new Soil();
		Soil soil1=new Seed();
		Soil soil2=new Root();
		Soil soil3=new Stem();
		Soil soil4=new Plant();
		Soil soil5=new Tree();
		Soil soil6=new Flower();
		Soil soil7=new Fruit();
		soil.soilInfo();
		System.out.println(soil.name);
		
		Seed seed=new Seed();
		Seed seed1=new Root();
		Seed seed2=new Stem();
		Seed seed3=new Plant();
		Seed seed4=new Tree();
		Seed seed5=new Flower();
		Seed seed6=new Fruit();
		seed.seedInfo();
		System.out.println(seed.type);
		
		Root root=new Root();
		Root root1=new Stem();
		Root root2=new Plant();
		Root root3=new Tree();
		Root root4=new Flower();
		Root root5=new Fruit();
		root.rootInfo();
		System.out.println(root.length);
		
		Stem stem=new Stem();
		Stem stem1=new Plant();
		Stem stem2=new Tree();
		Stem stem3=new Flower();
		Stem stem4=new Fruit();
		stem.stemInfo();
		System.out.println(stem.type);
		
		Plant plant=new Plant();
		Plant plant1=new Tree();
		Plant plant2=new Flower();
		Plant plant3=new Fruit();
		plant.plantInfo();
		System.out.println(plant.strong);
		
		Tree tree=new Tree();
		Tree tree1=new Flower();
		Tree tree2=new Fruit();
		tree.treeInfo();
		System.out.println(tree.name);
		
		Flower flower=new Flower();
		Flower flower1=new Fruit();
		flower.flowerInfo();
		System.out.println(flower.color);
		
		Fruit fruit=new Fruit();
		fruit.fruitInfo();
		System.out.println(fruit.name);
	}

}
