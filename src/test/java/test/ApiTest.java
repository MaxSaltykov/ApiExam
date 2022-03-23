package test;
import apiBase.BaseApi;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;

public class ApiTest extends BaseApi {


    @Дано("Последний эпизод с Морти")
    public void tests1 () {
        lastMortyEpisode();
    }

    @И("Выводим результат первого шага")
    public void result1 () {lastMortyEpisodeResult();}

    @Дано("Последний персонаж")
    public void tests2 () {
        lastMortyEpisode();
        lastPerson();
    }

    @И("Выводим результат второго шага")
    public void result2 () {lastPersonResult();}

    @Дано("Местонахожение и раса последнего персонажа")
    public void tests3 () {
        lastMortyEpisode();
        lastPerson();
        lastPersonProperties();
    }

    @И("Выводим результат третьего шага")
    public void result3 () {
        lastPersonPropertiesResult ();
    }

    @Дано("Сравнение местонахожения и расы последнего персонажа и Морти")
    public void tests4 () {
        lastMortyEpisode();
        lastPerson();
        lastPersonProperties();
    }

    @И("Выводим результат четвертого шага")
    public void result4 () {
        check();
    }
}