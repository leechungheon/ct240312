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
        String[] findId={};
        String[] uid={};
        for(int i=0; i<record.length; i++) {
            findId=record[i].split(" ");
            //findId[0]== enter,change, leave
            //findId[1]==*userid*
            //findId[2]==nickname
            for(int j=0; j<uid.length; j++) {//findId로 찾은 id를 uid 목록에 추가함.
                if (uid[j]!=null && findId[1]!=uid[j]){

                }else if(uid[j]==null){
                    uid[j]=findId[1];
                    User user=new User(findId[1],findId[2]);//name, nickname
                }
            }
        }
        return answer;
    }
}
 class User{
    String name;
    String nickname;
    public User(String name, String nickname){
        this.name=name;
        this.nickname=nickname;
    }
    public void PrintText(String state){
        if(state=="Enter"){
            System.out.println(nickname+"님이 들어왔습니다.");
        }else{
            System.out.println(nickname+"님이 나갔습니다.");
        }
    }
}