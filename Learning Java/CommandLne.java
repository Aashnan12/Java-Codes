class CommandLne {
    public static void main(String[] args) {
        // CommandLne obj = new CommandLne();
        // obj.Fact();
        int num = Integer.parseInt(args[0]);
        int f = 1;
        for(int i = 1;i<=num;i++){
            f = f*i;
        }
        System.out.println(f);
    }
}