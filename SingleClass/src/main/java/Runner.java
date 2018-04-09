public class Runner {

    public static void main(String[] args) {

        Bear skinnyBear = new Bear("boo", 21, 400.0, 'f');
        Bear cloneOfABear = skinnyBear;
                cloneOfABear.setAge(22);

        System.out.println(skinnyBear.getAge());
    }
}
