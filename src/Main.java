import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//https://school.programmers.co.kr/learn/courses/30/lessons/42888
public class Main {
    public static void main(String[] args) {
        String[] record={"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        Solution sol=new Solution();
        sol.solution(record);
    }
}
// id 읽고 새로운 id면 이름 저장, 같은 아이디 다른 이름이면 이름 수정, 각 이름마다 구조체 생성 후 이름 넣기
class Solution {
    public String[] solution(String[] record) {
        String[] answer = {}; // 정답
        String[][] result=new String[record.length][];
        for(int i=0; i<record.length; i++){
            result[i]=record[i].split(" ");
        }
        return answer;
    }
}
 class User{
    String[] name;
    String[] nickname;
    int index=0;
    public User(String name, String nickname){
        this.name[index]=name;
        this.nickname[index]=nickname;
        this.index++;
    }
    public void changeNickname(String name, String nickname){
        for(int i=0; i<name.length(); i++){
            if(name==this.name[i]){
                this.nickname[i]=nickname;
                break;
            }
        }
    }
}