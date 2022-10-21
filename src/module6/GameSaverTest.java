package module6;

class GameSaverTest {
    public static void main(String[] args) {
        //GameSaver created!
        for(int i = 0; i < 10; i++) {
            new GameSaver();
        }
    }
}

class GameSaver {
    static{
        System.out.println("GameSaver created!");
    }
}