package at.net.games.observers.Aufgabe2;

public class AlgoFactory {
    public String encrypt(String text) {
        String os = getOS(text);
        if (os.contains("win")){
            return BillGatesAlgo.getInstance().encrypt(text);
        }
        else if (os.contains("osx")){
            return SteveJobsAlgo.getInstance().encrypt(text);
        }
        else if (os.contains("nix")){
            return LinusTorvaldAlgo.getInstance().encrypt(text);
        }
        return "Kein passendes OS gefunden";
    }

    public String decrypt(String text) {
        String os = getOS(text);
        if (os.contains("win")){
            return BillGatesAlgo.getInstance().decrypt(text);
        }
        else if (os.contains("osx")){
            return SteveJobsAlgo.getInstance().decrypt(text);
        }
        else if (os.contains("nix")){
            return LinusTorvaldAlgo.getInstance().decrypt(text);
        }
        return "Kein passendes OS gefunden";
    }

    private String getOS(String text) {
        String os = System.getProperty("os.name").toLowerCase();
        return os;
    }
}
