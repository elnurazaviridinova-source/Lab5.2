package polymorphism;

public class Sports {
    public void play() {
        System.out.println("Playing some sport");
    }
}

class Football extends Sports {
    public void play() {
        System.out.println("Playing Football");
    }
}

class Basketball extends Sports {
    public void play() {
        System.out.println("Playing Basketball");
    }
}

class Rugby extends Sports {
    public void play() {
        System.out.println("Playing Rugby");
    }
}
