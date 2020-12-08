import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Класс-обработчик поступающих к боту сообщений.
 */
class Bot extends TelegramLongPollingBot {
    /**
     * Метод, который возвращает токен, выданный нам ботом @BotFather.
     * @return токен
     */
    @Override
    public String getBotToken() {
        return "1458154851:AAGagK73awsBFcVypVRL8jCCLeGzHPk7miQ";
    }

    /**
     * Метод-обработчик поступающих сообщений.
     * @param update объект, содержащий информацию о входящем сообщении
     */
    @Override
    public void onUpdateReceived(Update update) {
        try {
            //проверяем есть ли сообщение и текстовое ли оно
            if (update.hasMessage() && update.getMessage().hasText()) {
                //Извлекаем объект входящего сообщения
                Message inMessage = update.getMessage();
                //Создаем исходящее сообщение
                SendMessage outMessage = new SendMessage();
                //Указываем в какой чат будем отправлять сообщение
                //(в тот же чат, откуда пришло входящее сообщение)
                outMessage.setChatId(inMessage.getChatId());

                outMessage.setText(Sentences.parsAnswer(inMessage.getText().toLowerCase()));
                //Отправляем сообщение
                execute(outMessage);
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод, который возвращает имя пользователя бота.
     * @return имя пользователя
     */
    @Override
    public String getBotUsername() {
        return "ParkovBot";
    }
}