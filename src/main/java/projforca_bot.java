import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class projforca_bot extends TelegramLongPollingBot {

    Forca forca = new Forca();

//    n entendi pq q n ta funcionando essa parte aqui em baixo.
    public void onUpdateReceived(Update update) {

        System.out.println("teste");

        forca.start();

    }

    public String getBotUsername() {

        return "projforca_bot";
    }

    public String getBotToken() {

        return getChave();
    }

    private String getChave() {
        // The name of the file to open.
        String fileName = "/home/ladp17/Documents/botTelegram/projforca_bot/.chave.txt";

        // This will reference one line at a time
        String line = null;
        String key = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {

                key = line;

            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }


        return key;
    }
}
