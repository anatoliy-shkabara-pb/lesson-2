public class S09_InstanceofOperator {
    public static void main(String[] args) {
        String name = "Олег";
        // Следующее вернётся верно, поскольку тип String
        boolean result = name instanceof String;
        System.out.println(result);
    }
}
