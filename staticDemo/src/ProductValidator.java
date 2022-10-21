public class ProductValidator {
    static {
        System.out.println("Static yapıcı blok çalıştı");
    }

    public ProductValidator() {
        System.out.println("yapıcı blok çalıştı"); /*product managerda newlenmesi gerekli*/
    }

    public static boolean isValid(Product product) {/* kullan atlarda static kullanılır (araştır) Dİrekt ProductValidator.isValid olarak çağrılabilir*/
        if (product.price > 0 && !product.name.isEmpty()) { /*ünlem ! değilse demektir*/
            return true;
        } else {
            return false;
        }


    }
}
