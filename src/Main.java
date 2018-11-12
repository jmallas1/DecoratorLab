public class Main
{
    public static void main(String[] args)
    {
        Character basicCharacter = new Shield (new Spear(new Sword(new BasicCharacter("Bilbo"))));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Heath: " + basicCharacter.getHealth());

        basicCharacter = new Starving(basicCharacter);
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Heath: " + basicCharacter.getHealth());

    }
}
