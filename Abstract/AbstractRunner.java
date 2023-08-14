package com.xworkz.Abstract;

public class AbstractRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in AbstractRunner");
		Movie movie = new ShortMovie();
		movie.action();
		movie.audio();
		movie.climax();
		movie.dance();
		movie.display();
		movie.releaseDate();
		movie.teaser();
		movie.theme();
		movie.trailer();
		movie.video();
		System.out.println("------------------------------");
		Shape shape = new Area();
		shape.circle();
		shape.diameter();
		shape.draw();
		shape.factor();
		shape.noOfSides();
		shape.points();
		shape.regular();
		shape.rotate();
		shape.triangle();
		shape.vertices();
		System.out.println("------------------------------");
		Education education = new Training();
		education.attendance();
		education.enjoyment();
		education.experience();
		education.graduation();
		education.knowledge();
		education.knowledge();
		education.learning();
		education.practise();
		education.presenation();
		education.skills();
		System.out.println("------------------------------");
		Employee employee = new Manager();
		employee.awards();
		employee.dedication();
		employee.ethics();
		employee.experience();
		employee.interest();
		employee.job();
		employee.jobrole();
		employee.knowledge();
		employee.presenationStyle();
		employee.skills();
		System.out.println("------------------------------");
		SocialMedia socialMedia = new YouTube();
		socialMedia.audio();
		socialMedia.dislikes();
		socialMedia.display();
		socialMedia.entertainment();
		socialMedia.likes();
		socialMedia.subscribers();
		socialMedia.theme();
		socialMedia.trend();
		socialMedia.users();
		socialMedia.video();
	}

}
