public class Sentences {
    static public String parsAnswer(String ask) {
        String answer = new String();

        if (ask.equals("/start"))
            return "Добро пожаловать в ParkovBot v 0.1.3 \n" +
                    "Для начала поздаровайтесь или используйте команду /help \n" +
                    "                      by OleKosTech 2020";
        if (ask.equals("/help"))
            return "Некоторые ключевые слова: привет, Ксюша, Катя, шпек. \n\n"+
                    "Для ответа на вопрос используйте формат *номер вопроса + нижнее подчеркивание + ответ*\n" +
                    "Пример: -  \"1_Покакал?\" \n" +
                    "        -  \"1_Да\"";
        if (ask.equals("привет") || ask.equals("здаров") || ask.equals("хай"))
            return getGreetingMessage();
        if (ask.indexOf("ксюш") >= 0)
            return "Яяя не оббмнннывал ее, чччестно";
        if (ask.indexOf("катя") >= 0)
            return "ГДЕ???????";
        if (ask.indexOf("шпек") >= 0 || ask.indexOf("шпак") >= 0)
            return "ВИВИВИВИВИИВИ Вжух, шпек Шпак шпук, ура буду учить философию трое суток";
        if (ask.indexOf("как тебя зовут") >= 0)
            return "1_Ннникита, но друзззья ннназывают как хотят. А тебя?";
        if (ask.indexOf("1_") >= 0)
            return "2_Хуе".concat(ask.substring(3).concat(". ХЫЫЫЫ, классная шшутткаа?"));
        if (ask.indexOf("2_да") >= 0)
            return ("ЯЯЯ класссный, Ксюшшша ллллюбит");
        if (ask.indexOf("2_нет") >= 0)
            return ("ЫЫЫЫЫЫЫЫ((((((((");
        if (ask.indexOf("говор") >= 0)
            return ("Пшеееелллл нахх");
        if (ask.indexOf("как дела") >= 0)
            return getHowAreYouMessage();
        if (ask.indexOf("3_") >= 0)
            return ("Ты под шпеком????????");
        if (ask.indexOf("4_") >= 0)
            return ("Блин, Ккатю вссспомнил(");
        if (ask.indexOf("3_") >= 0)
            return ("Ксююшкпшшшшашшкккашшшшк");
        return "Ннепоннимаю";
    }
    public static String getHowAreYouMessage()
    {
        int a = 0;
        int b = 2;
        int randNum = a + (int) (Math.random() * b);
        if(randNum == 0)
            return "3_Збс,а ты?";
        if(randNum == 1)
            return "4_Ххреново, сам как?";
        if(randNum == 2)
            return "5_БЗзвзззббззззббз. Сззмкак?";

        return "Жру говно";
    }
    public static String getGreetingMessage()
    {
        int a = 0;
        int b = 3;
        int randNum = a + (int) (Math.random() * b);
        if(randNum == 0)
            return "Ппппппппрррииииивет";
        if(randNum == 1)
            return "Дррдрова пааацаны";
        if(randNum == 2)
            return "ХХАААААААЙЙЙ";
        if(randNum == 3)
            return "Изззвини, не ммогу говорррить";
        return "Жру говно";
    }
}
