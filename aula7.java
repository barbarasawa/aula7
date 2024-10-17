public class TesteLeitura {

    public static void main(String[] args) {

    }

}
public class TesteLeitura {

    public static void main(String[] args) {

        FileInputStream fis = new FileInputStream("lorem.txt");
    }

}
public class TesteLeitura {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("lorem.txt");
    }

}
public class TesteLeitura {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
    }

}
public class TesteLeitura {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
    }

}
public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
    }
}
public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }

}