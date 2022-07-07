package roman.lesson_12.day_6;

import roman.lesson_12.day_5.Product;
import roman.lesson_12.day_5.ProductValidator;
import roman.lesson_12.day_5.ProductValidatorImpl;
import roman.lesson_12.day_5.ValidationException;

import java.util.List;

public class ProductValidatorImplTest {

    ProductValidator productValidator = new ProductValidatorImpl(new ProductPriceValidationRule(),
            new ProductTitleValidationRule(), new ProductDescriptionValidationRule());
    String title = "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB";
    String description = "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB" +
            "AAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBBAAAAAAAAAABBBBBBBBBB";
    
    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();

        test.productTitleNotEmpty_v1();
        test.productTitleNotEmpty_v2();
        test.productTitleNotShorterThreeSymbols();
        test.productTitleNotLongerThan100Symbols();
        test.titleMustContainEnglishLettersAndNumbers_v1();
        test.titleMustContainEnglishLettersAndNumbers_v2();
        test.titleMustContainEnglishLettersAndNumbers_v3();

        test.productPriceNotEmpty();
        test.productPriceMustBeOverZero();

        test.descriptionMustBeLess2000Symbols();
        test.descriptionMustContainEnglishLettersAndNumbers_v1();
        test.descriptionMustContainEnglishLettersAndNumbers_v2();
        test.descriptionMustContainEnglishLettersAndNumbers_v3();

        test.emptyTitleAndEmptyPrice();
        test.incorrectTitleNameAndPriceZero();
        test.emptyTitlePriseZeroToLongDescription();

    }
    void productTitleNotEmpty_v1() {
        Product door = new Product(null, 1, "Oak Bath Door");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "Title with null");
        checkResult(validationExceptionList.get(0).getRuleName().equals("titleMustBeFilledUp"),
                "Title with null, RuleName");
        checkResult(validationExceptionList.get(0).getFieldName().equals("title"), "Title with null, FieldName");
        checkResult(validationExceptionList.get(0).getDescription().equals("Product Title Can't be Empty"),
                "Title with null, Description");
    }
    void productTitleNotEmpty_v2() {
        Product door = new Product("", 1, "Oak Bath Door");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "Title no Letters");
        checkResult(validationExceptionList.get(0).getRuleName().equals("titleMustBeFilledUp"),
                "Title no Letters, RuleName");
        checkResult(validationExceptionList.get(0).getFieldName().equals("title"), "Title no Letters, FieldName");
        checkResult(validationExceptionList.get(0).getDescription().equals("Product Title Can't be Empty"),
                "Title no Letters, Description");
    }

    void productTitleNotShorterThreeSymbols() {
        Product door = new Product("A", 1, "Oak Bath Door");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "Product Title Can't Shorter Three Symbols");
        checkResult(validationExceptionList.get(0).getRuleName().equals("titleNotShorterThreeSymbols"),
                "Product Title Can't Shorter Than Three Symbols, RuleName");
        checkResult(validationExceptionList.get(0).getFieldName().equals("title"),
                "Product Title Can't Shorter Than Three Symbols, FieldName");
        checkResult(validationExceptionList.get(0).getDescription().equals("Product Title Can't be shorter than 3 symbols"),
                "Product Title Can't Shorter Than Three Symbols, Description");
    }

    void productTitleNotLongerThan100Symbols() {
        Product door = new Product(title, 1, "Oak Bath Door");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "productTitleNotLongerThan100Symbols");
        checkResult(validationExceptionList.get(0).getRuleName().equals("productTitleNotLongerThan100Symbols"),
                "productTitleNotLongerThan100Symbols, RuleName");
        checkResult(validationExceptionList.get(0).getFieldName().equals("title"),
                "productTitleNotLongerThan100Symbols, FieldName");
        checkResult(validationExceptionList.get(0).getDescription().equals("Product Title can't be longer than 100 symbols"), 
                "productTitleNotLongerThan100Symbols, Description");
    }
    
    void titleMustContainEnglishLettersAndNumbers_v1() {
        Product door = new Product("Door_1", 1, "Oak Bath Door");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "Product Title Must Contain English Letters And Numbers v1");
        checkResult(validationExceptionList.get(0).getRuleName().equals("titleMustContainEnglishLettersAndNumbers"),
                "Product Title Must Contain English Letters And Numbers v1, RuleName");
        checkResult(validationExceptionList.get(0).getFieldName().equals("title"), 
                "Product Title Must Contain English Letters And Numbers v1, FieldName");
        checkResult(validationExceptionList.get(0).getDescription().equals("Title must contain only English letters and numbers"),
                "Product Title Must Contain English Letters And Numbers v1, Description");
    }

    void titleMustContainEnglishLettersAndNumbers_v2() {
        Product door = new Product("Door.1", 1, "Oak Bath Door");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "Product Title Must Contain English Letters And Numbers v2");
        checkResult(validationExceptionList.get(0).getRuleName().equals("titleMustContainEnglishLettersAndNumbers"),
                "Product Title Must Contain English Letters And Numbers v2, RuleName");
        checkResult(validationExceptionList.get(0).getFieldName().equals("title"),
                "Product Title Must Contain English Letters And Numbers v2, FieldName");
        checkResult(validationExceptionList.get(0).getDescription().equals("Title must contain only English letters and numbers"),
                "Product Title Must Contain English Letters And Numbers v2, Description");
    }

    void titleMustContainEnglishLettersAndNumbers_v3() {
        Product door = new Product("Дверь", 1, "Oak Bath Door");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "Product Title Must Contain English Letters And Numbers v3");
        checkResult(validationExceptionList.get(0).getRuleName().equals("titleMustContainEnglishLettersAndNumbers"),
                "Product Title Must Contain English Letters And Numbers v3, RuleName");
        checkResult(validationExceptionList.get(0).getFieldName().equals("title"),
                "Product Title Must Contain English Letters And Numbers v3, FieldName");
        checkResult(validationExceptionList.get(0).getDescription().equals("Title must contain only English letters and numbers"),
                "Product Title Must Contain English Letters And Numbers v3, Description");
    }

    void productPriceNotEmpty() {
        Product door = new Product("Door", null, "Oak Bath Door");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "Product Price Not Empty");
        checkResult(validationExceptionList.get(0).getRuleName().equals("productPriceNotEmpty"),
                "Price Can't Empty, RuleName");
        checkResult(validationExceptionList.get(0).getFieldName().equals("price"), "Price Can't be Empty, FieldName");
        checkResult(validationExceptionList.get(0).getDescription().equals("Price can't be empty"),
                "Price Can't be Empty, Description");
    }

    void productPriceMustBeOverZero() {
        Product door = new Product("Door", 0, "Oak Bath Door");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "Price Must Be Over Zero");
        checkResult(validationExceptionList.get(0).getRuleName().equals("productPriceMustBeOverZero"),
                "Price Must Be Over Zero, RuleName");
        checkResult(validationExceptionList.get(0).getDescription().equals("Price is Lower than Zero!"),
                "Price Must Be Over Zero, Description");
        checkResult(validationExceptionList.get(0).getFieldName().equals("price"),
                "Price Must Be Over Zero, FieldName");

    }

    void descriptionMustBeLess2000Symbols() {
        Product door = new Product("Door", 1, description);
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "Description Must Be Less 2000 Symbols");
        checkResult(validationExceptionList.get(0).getRuleName().equals("descriptionMustBeLess2000Symbols") ,
                "Description Must Be Less 2000 Symbols, RuleName");
        checkResult(validationExceptionList.get(0).getFieldName().equals("description"),
                "Description Must Be Less 2000 Symbols, FieldName");
        checkResult(validationExceptionList.get(0).getDescription().equals("Description Must Be Less 2000 Symbols!"),
                "Description Must Be Less 2000 Symbols, Description");
    }

    void descriptionMustContainEnglishLettersAndNumbers_v1() {
        Product door = new Product("Door", 1, "Door_1");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "descriptionMustContainEnglishLettersAndNumbers_v1");
        checkResult(validationExceptionList.get(0).getRuleName().equals("descriptionMustContainEnglishLettersAndNumbers"),
                "Product Description Must Contain English Letters And Numbers v1");
        checkResult(validationExceptionList.get(0).getFieldName().equals("description"),
                "Product Description Must Contain English Letters And Numbers v1");
        checkResult(validationExceptionList.get(0).getDescription().equals("Description must contain only English letters and numbers"),
                "Product Description Must Contain English Letters And Numbers v1");
    }

    void descriptionMustContainEnglishLettersAndNumbers_v2() {
        Product door = new Product("Door", 1, "Door.1");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "descriptionMustContainEnglishLettersAndNumbers_v2");
        checkResult(validationExceptionList.get(0).getRuleName().equals("descriptionMustContainEnglishLettersAndNumbers"),
                "Product Description Must Contain English Letters And Numbers v2");
        checkResult(validationExceptionList.get(0).getFieldName().equals("description"),
                "Product Description Must Contain English Letters And Numbers v2");
        checkResult(validationExceptionList.get(0).getDescription().equals("Description must contain only English letters and numbers"),
                "Product Description Must Contain English Letters And Numbers v2");
    }

    void descriptionMustContainEnglishLettersAndNumbers_v3() {
        Product door = new Product("Door", 1, "Дверь");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 1, "descriptionMustContainEnglishLettersAndNumbers_v3");
        checkResult(validationExceptionList.get(0).getRuleName().equals("descriptionMustContainEnglishLettersAndNumbers"),
                "Product Description Must Contain English Letters And Numbers v3");
        checkResult(validationExceptionList.get(0).getFieldName().equals("description"),
                "Product Description Must Contain English Letters And Numbers v3");
        checkResult(validationExceptionList.get(0).getDescription().equals("Description must contain only English letters and numbers"),
                "Product Description Must Contain English Letters And Numbers v3");
    }

    void emptyTitleAndEmptyPrice() {
        Product door = new Product(null, null, "Oak");
        List<ValidationException> validationExceptionList = productValidator.validate(door);
        checkResult(validationExceptionList.size() == 2, "Empty Title and Price");
        checkResult(validationExceptionList.contains(new ValidationException("titleMustBeFilledUp", "Product Title Can't be Empty", "title")),
                "Contain Title can't be null Exception");
        checkResult(validationExceptionList.contains(new ValidationException("productPriceNotEmpty", "Price can't be empty", "price")),
                "Price can't be empty");
    }

    void incorrectTitleNameAndPriceZero() {
        Product box = new Product("Box.1", 0, "Plastic Box");
        List<ValidationException> validationExceptions = productValidator.validate(box);
        checkResult(validationExceptions.size() == 2, "Incorrect Title and Prize zero");
        checkResult(validationExceptions.contains(new ValidationException("titleMustContainEnglishLettersAndNumbers", "Title must contain only English letters and numbers", "title")),
                "Validation exception list contain 'Title exception!'");
        checkResult(validationExceptions.contains(new ValidationException("productPriceMustBeOverZero", "Price is Lower than Zero!", "price")),
                "Validation exception list contain 'Prise exception!");
    }

    void emptyTitlePriseZeroToLongDescription() {
        Product box = new Product("", 0, description);
        List<ValidationException> validationExceptionList = productValidator.validate(box);
        checkResult(validationExceptionList.size() == 3, "Exception list contain Tree exception");
        checkResult(validationExceptionList.contains(new ValidationException("titleMustBeFilledUp", "Product Title Can't be Empty", "title")),
                "Exception list contain 'Title can't be Empty'");
        checkResult(validationExceptionList.contains(new ValidationException("productPriceMustBeOverZero", "Price is Lower than Zero!", "price")),
                "Exception list contain 'Price must be over zero'");
        checkResult(validationExceptionList.contains(new ValidationException("descriptionMustBeLess2000Symbols", "Description Must Be Less 2000 Symbols!",
                "description")), "Exception list contain 'Description over 2000 Symbols'");
    }
    
    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " test - OK!" );
        } else {
            System.out.println(nameOfTest + " test - Fail!");
        }
    }
}
