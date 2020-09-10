class monExemple { // afficher x fois hello world
    public static void main(String[] args) {
        if (args.length > 0) {

        int x = Integer.parseInt(args[0]);
        for (int i = 0; i < x; i++) {
            System.out.println("Hello world !");
        }

        for (int j = 0; j < args.length; j++) {
            System.out.println(args[j]);
        }
    }
    }
}