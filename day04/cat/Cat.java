package cat;

public class Cat {


    String breed;
    String color;
    int age;
    
    public Cat() {
    	
    }

    public Cat(String breed, String color, int age) { // 품종, 색깔, 나이 초기화
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
    
    public Cat(String breed, String color) { // 품종, 색깔 초기화
//        this.breed = breed;
//        this.color = color;
    	this(breed, color, 0);
    }
    
    public Cat(String breed) { // 품종만 초기화
//        this.breed = breed;
        this(breed, null, 0);
    }


    void eat(String time) {
        System.out.println(time + "에 사료를 먹습니다.");
    }

    void scratch() {
        System.out.println("스크래치를 긁습니다.");
    }

    void meow() {
        System.out.println("야옹!");
    }

    void setColor(String color) {
        this.color = color;
    }
}