import java.util.Scanner;

public class testMain{
    
    static String MyKey = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjA0MTU5NWY0LWYyODQtNGY5Yi1iZjhjLTg4ZTIzZmY2NWIyMyIsImlhdCI6MTU4NjUxNjMwNiwic3ViIjoiZGV2ZWxvcGVyL2U2OTYzYTM0LTJhYjktZjI1Ny0yYWVlLTZhMTc2NmE5NTJiMSIsInNjb3BlcyI6WyJicmF3bHN0YXJzIl0sImxpbWl0cyI6W3sidGllciI6ImRldmVsb3Blci9zaWx2ZXIiLCJ0eXBlIjoidGhyb3R0bGluZyJ9LHsiY2lkcnMiOlsiMjIyLjIzNy4zMy4yMzUiXSwidHlwZSI6ImNsaWVudCJ9XX0.ROrJG935BnvHUKaP6JuDfs9G5do0eUMyZ6D2ecsK03zZOyPCgDnf_2dPXvBGy7NJMlMX9g0eFxY8_4rhdvLWZQ";
    static String MyBethanyKey = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjQ1MWMwOTQyLWJkYWEtNDYzNy04NzA2LTYxMzFiZDA1ZjhlNSIsImlhdCI6MTU4NjUwMTI5NCwic3ViIjoiZGV2ZWxvcGVyL2U2OTYzYTM0LTJhYjktZjI1Ny0yYWVlLTZhMTc2NmE5NTJiMSIsInNjb3BlcyI6WyJicmF3bHN0YXJzIl0sImxpbWl0cyI6W3sidGllciI6ImRldmVsb3Blci9zaWx2ZXIiLCJ0eXBlIjoidGhyb3R0bGluZyJ9LHsiY2lkcnMiOlsiMTIxLjE0MS4xOTIuMjMwIl0sInR5cGUiOiJjbGllbnQifV19.Zxwtpe_jlqJaUWObRzSgwQfoW8kGXS7SntBrBhrfDRR98uqRws92nUKhVrikrUGXzZRGwnvReWnn0zJovunhrQ";
    static String MyMobileKey = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6ImUwNTRjOGJmLTcyYzktNDFiYy05Y2JhLTdjYTdkMDA0OTlkYiIsImlhdCI6MTU4Njc0MTg1OCwic3ViIjoiZGV2ZWxvcGVyL2U2OTYzYTM0LTJhYjktZjI1Ny0yYWVlLTZhMTc2NmE5NTJiMSIsInNjb3BlcyI6WyJicmF3bHN0YXJzIl0sImxpbWl0cyI6W3sidGllciI6ImRldmVsb3Blci9zaWx2ZXIiLCJ0eXBlIjoidGhyb3R0bGluZyJ9LHsiY2lkcnMiOlsiMjIzLjYyLjIxNi4zNyJdLCJ0eXBlIjoiY2xpZW50In1dfQ.ph0PqIVaYUpqsloGzMFb63qpV22m7EY5Y2Zj73iO8RMzImfo0oyyXEZZGBs_lWP1BMN8VfXYIXlPu0rfuzKOZA";
    static String playerInfoURL = "https://api.brawlstars.com/v1/players/";

    // example tag : LUPJ08LU

    public static void main(String[] args) {
        
        System.out.println("당신의 태그를 입력해주세요.(단, #은 제외하고 입력해주세요)");
        System.out.print("#");

        Scanner scanner = new Scanner(System.in);
        String playerTag = scanner.nextLine();

        BrawlStarsAPI brawlStarsAPI = new BrawlStarsAPI();

        //brawlStarsAPI.ShowPlayerInformation(MyKey, playerInfoURL + "%23" + playerTag);
        //brawlStarsAPI.ShowPlayerInformation(MyBethanyKey, playerInfoURL + "%23" + playerTag);
        brawlStarsAPI.ShowPlayerInformation(MyMobileKey, playerInfoURL + "%23" + playerTag);
    }
}