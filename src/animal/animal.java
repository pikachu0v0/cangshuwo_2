package animal;

abstract class animal {
	protected int legs;

	animal() {

	}

	protected animal(int leg) {
		legs = leg;
	}

	abstract void eat();

	public void walk() {
		System.out.println("动物行走");
	}
}

class spider extends animal {
	public spider() {
		super(8);
		System.out.println("所有的蜘蛛都是" + legs + "条腿");
	}

	public void eat() {
		System.out.println("吃东西");
	}
}

interface pet {
	public String getname();

	public void setname(String name);

	public void play();

}

class cat extends animal implements pet {
	private String name;

	cat(String name) {
		super(4);
		this.name = name;
		System.out.println("所有的猫都是" + legs + "条腿");
	}

	cat() {
		this(" ");
	}

	@Override
	void eat() {
		System.out.println("猫吃东西");// TODO Auto-generated method stub
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void play() {

	}

}// cat

class fish extends animal implements pet {
	
	private String name;
	fish() {
super(0);
	}
	fish(String name){
		this.name=name;
	}

	public void walk() {
		System.out.println("鱼不能走路");
	}

	public void eat() {
		System.out.println("鱼吃东西");
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setname(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

}
