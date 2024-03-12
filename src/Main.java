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
        User user=new User(record.length);
        String[] answer = {}; // 정답
        String[][] result=new String[record.length][];
        for(int i=0; i<record.length; i++){
            result[i]=record[i].split(" ");
        }
        for(int i=0; i<record.length; i++){
            if(result[i].length>2 && !result[i][0].equals("Change")){ //nickname 존재하고 change 아니면, 즉, 처음이름이라면
                user.setting(result[i][1],result[i][2]);
            }else if(result[i][0].equals("Change")){//nickname change의 경우
                user.changeNickname(result[i][1],result[i][2]);
            }
        }
        for(int i=0; i<record.length; i++){
            user.printMesage(result[i][1],result[i][0]);
        }
        return answer;
    }
}
 class User{
    String[] name;
    String[] nickname;
    int index=0;
     public User(int size){
         name = new String[size];
         nickname = new String[size];
     }
    public void setting(String name, String nickname){
        this.name[index]=name;
        this.nickname[index]=nickname;
        this.index++;
    }
    public void changeNickname(String name, String nickname){
        for(int i=0; i<name.length(); i++){
            if(name.equals(this.name[i])){
                this.nickname[i]=nickname;
                break;
            }
        }
    }
    public void printMesage(String name, String state){
        for(int i=0; i<index; i++){
            if(name.equals(this.name[i])){
                if(state.equals("Enter"))System.out.println(this.nickname[i]+"님이 들어왔습니다.");
                else if(state.equals("Leave"))System.out.println(this.nickname[i]+"님이 나갔습니다.");
            }
        }
    }
}