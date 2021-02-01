public class Test {


    @Test
    voidshouldSubmitRequest(){
        open("http://localhost:9999");
        SelenideElementform=$("[data-test-id=callback-form]");
        form.$("[data-test-id=name]input").setValue("Василий");
        form.$("[data-test-id=phone]input").setValue("+79270000000");
        form.$("[data-test-id=agreement]").click();
        form.$("[data-test-id=submit]").click();
        $(".alert-success").shouldHave(exactText("Вашазаявкауспешноотправлена!"));
}
