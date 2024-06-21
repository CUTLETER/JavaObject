package day11.inter.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Tiger t1 = new Tiger();
		*/
		
		Animal d = new Dog();
		Animal c = new Cat();
		Animal t = new Tiger();
		
		Animal[] arr = {d,c,t};
		
		for(Animal an : arr) {
			an.eating();
		}
		
		
		System.out.println("-----------------");
		
		
		// IPet 배열을 생성하고 IPet에 들어갈 수 있는 타입은 dog, cat, GoldFish
		
		IPet[] arr2 = new IPet[3];
		arr2[0] = (IPet)d; // IPet과 Animal 은 관계가 없지만 dog 가 상호적 연관성이 있기에 형 변환이 가능함
		arr2[1] = (IPet)c;
		arr2[2] = new GoldFish(); // GoldFish -> IPet 자동 형 변환
		
		for(IPet pet : arr2) {
			pet.playing();
		}
		
		
		
		System.out.println("-------------------");
		
		
		
		
		PetHouse ph = new PetHouse();
		
		ph.carePet((IPet)d);
		ph.carePet((IPet)c);
		ph.carePet(new GoldFish());
		
		ph.petInfo(arr2);
		
	}

}
