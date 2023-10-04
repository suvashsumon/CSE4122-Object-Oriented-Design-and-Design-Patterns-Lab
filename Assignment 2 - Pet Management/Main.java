import java.util.List;

class Main
{
    public static void main(String[] args) {
        String pet1name = "Barbie";
        int pet1age = 2;
        String pet1color = "pink";
        String pet1type = "cat";
        String pet1ownerName = "Virat Kohli";
        String pet1ownerPhoneNo = "017XXXXXXXX";
        Pet newPet1 = new Pet(pet1name, pet1age, pet1color, pet1type, pet1ownerName, pet1ownerPhoneNo);

        String pet2name = "Fluffy";
        int pet2age = 3;
        String pet2color = "pink";
        String pet2type = "dog";
        String pet2ownerName = "Cristriano Ronaldo";
        String pet2ownerPhoneNo = "019XXXXXXXX";
        Pet newPet2 = new Pet(pet2name, pet2age, pet2color, pet2type, pet2ownerName, pet2ownerPhoneNo);

        PetManager petManager = new PetManager();

        petManager.addPet(newPet1);
        petManager.petStatus(newPet1);

        petManager.addPet(newPet2);
        petManager.feedPet(newPet2);

        petManager.getOwnerInfo(newPet2);

        List<Pet> petList = petManager.getPets();

        for (Pet petitem : petList) {
            System.out.println("Pet Name : "+petitem.name);
            System.out.println("Pet Color : "+petitem.color);
            System.out.println("Pet Age : "+petitem.age);
            System.out.println("Pet Type : "+petitem.type);
            System.out.println("Pet Owner : "+petitem.owner.ownerName);
            System.out.println("Pet Owner Contact : "+petitem.owner.ownerPhoneNo);
            System.out.println();
        }
    }
}