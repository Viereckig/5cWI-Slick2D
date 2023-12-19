package at.net.games.test.Übung1;

public class Cat implements Animal{
        String name;
        public Cat(String name) {
            this.name = name;
        }


        @Override
        public void run() {

        }

        @Override
        public String getName() {
            return "Minka";
        }
}
