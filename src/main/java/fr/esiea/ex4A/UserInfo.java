package fr.esiea.ex4A;
import com.fasterxml.jackson.annotation.JsonProperty;
public class UserInfo {
    public final String userEmail, userName, userTweeter, userCountry, userSex, userSexPref;

    public UserInfo(@JsonProperty("userEmail") String userEmail, @JsonProperty("userName") String userName, @JsonProperty("userTweeter") String userTweeter, @JsonProperty("userCountry") String userCountry, @JsonProperty("userSex") String userSex, @JsonProperty("userSexPref") String userSexPref){
        this.userEmail = userEmail;
        this.userName = userName;
        this.userTweeter = userTweeter;
        this.userCountry = userCountry;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
            "userEmail='" + userEmail + '\'' + ", userName='" + userName + '\'' + ", userTweeter='" + userTweeter + '\'' + ", userCountry='" + userCountry + '\'' + ", userSex='" + userSex + '\'' + ", userSexPref='" + userSexPref + '\'' + '}';
    }
}
