import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File games = new File("/Users/ekaterinapyhtina/Desktop/Games");
        File src = new File("/Users/ekaterinapyhtina/Desktop/Games/src");
        File res = new File("/Users/ekaterinapyhtina/Desktop/Games/res");
        File saveGames = new File("/Users/ekaterinapyhtina/Desktop/Games/saveGames");
        File temp = new File("/Users/ekaterinapyhtina/Desktop/Games/temp");
        File main = new File("/Users/ekaterinapyhtina/Desktop/Games/src/main");
        File test = new File("/Users/ekaterinapyhtina/Desktop/Games/src/test");
        File mainJava = new File("/Users/ekaterinapyhtina/Desktop/Games/src/main/Main.java");
        File utilsJava = new File("/Users/ekaterinapyhtina/Desktop/Games/src/main/Utils.java");
        File drawables = new File("/Users/ekaterinapyhtina/Desktop/Games/res/drawables");
        File vectors = new File("/Users/ekaterinapyhtina/Desktop/Games/res/vectors");
        File icons = new File("/Users/ekaterinapyhtina/Desktop/Games/res/icons");
        File tempTxt = new File("/Users/ekaterinapyhtina/Desktop/Games/temp/temp.txt");
        try {
            if (games.mkdir()) sb.append("Каталог Games создан\n");
            if (src.mkdir()) sb.append("Каталог src создан\n");
            if (res.mkdir()) sb.append("Каталог res создан\n");
            if (saveGames.mkdir()) sb.append("Каталог saveGames создан\n");
            if (temp.mkdir()) sb.append("Каталог temp создан\n");
            if (main.mkdir()) sb.append("Каталог main создан\n");
            if (test.mkdir()) sb.append("Каталог test создан\n");
            if (drawables.mkdir()) sb.append("Каталог drawables создан\n");
            if (vectors.mkdir()) sb.append("Каталог vectors создан\n");
            if (icons.mkdir()) sb.append("Каталог icons создан\n");
            if (mainJava.createNewFile()) sb.append("Файл mainJava создан\n");
            if (utilsJava.createNewFile()) sb.append("Файл utilsJava создан\n");
            if (tempTxt.createNewFile()) sb.append("Файл mainJava создан\n");
            FileWriter writer = new FileWriter("/Users/ekaterinapyhtina/Desktop/Games/temp/temp.txt", false);
            writer.write(sb.toString());
            writer.flush();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/ekaterinapyhtina/Desktop/Games/temp/temp.txt"))) {
            String s;
            while ((s = br.readLine()) != null) System.out.println(s);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}