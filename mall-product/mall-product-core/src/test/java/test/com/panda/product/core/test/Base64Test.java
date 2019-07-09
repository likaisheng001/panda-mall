package test.com.panda.product.core.test;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * 2018/1/25
 *
 * @author: likaisheng
 */

public class Base64Test {
    // 编码
    @Test
    public void encoding() throws UnsupportedEncodingException {
        Base64 base64 = new Base64();
        String text = "字串文字";
        byte[] textByte = text.getBytes("UTF-8");
        String encodedText = base64.encodeToString(textByte);
        System.out.println("base64编码后得:" + encodedText);
    }
    // 解码
    @Test
    public void decoding(){
        Base64 base64 = new Base64();
        String encodedText = "eyJpbnN0b2NrIjp7ImlkIjo3NzMsImluc3RvY2tJZCI6Ijk3NDc2NzU4Iiwib3JkZXJJZCI6Ik9FTTAwMTM5Iiwid2FyZUlkIjoxLCJ3YXJlTmFtZSI6IuWMl+S6rOW5s+iwt+S7kyIsInN0YXR1cyI6NCwicmVjZWl2ZVN0YXJ0IjoiMjAxOC0wMS0xNSAxOTo1ODoxNiIsInJlY2VpdmVFbmQiOiIyMDE4LTAxLTE1IDE5OjU4OjI3Iiwic3VwcGxpZXJJZCI6OTAwMDEyMiwic3VwcGxpZXJOYW1lIjoi5YyX5Lqs6Iqs5bid6aOf5ZOB5pyJ6ZmQ5YWs5Y+477yI5Yqg5bel77yJIiwiY3JlYXRlZEJ5IjoidGFuZ3RhaXllIiwiY3JlYXRpb25EYXRlIjoiMjAxOC0wMS0xNSAxMzozODo0OSIsImNoYW5nZWRCeSI6IldNUyIsImxhc3RDaGFuZ2VkRGF0ZSI6IjIwMTgtMDEtMTUgMjA6MDA6MDAifSwic2t1cyI6W3siaWQiOjc3MywiaW5zdG9ja0lkIjoiOTc0NzY3NTgiLCJza3VJZCI6MTAwODU0NCwic2t1TmFtZSI6IuiHqueEtuaenOWunueEmeeDpOaJgeahg+S7gTEwMGciLCJza3VVbml0TmFtZSI6IuiiiyIsInBsYW5OdW0iOjEwMDAwMC4wMCwiaW5zdG9ja051bSI6MTAwMC4wMCwiYWN0dWFsTnVtIjoxMDAwLjAwLCJjcmVhdGVkQnkiOiJ0YW5ndGFpeWUiLCJjcmVhdGlvbkRhdGUiOiIyMDE4LTAxLTE1IDEzOjM4OjQ5IiwiY2hhbmdlZEJ5IjoiV01TIiwibGFzdENoYW5nZWREYXRlIjoiMjAxOC0wMS0xNSAyMDowMDowMCJ9XX0=";
        System.out.println("base64解码后得：" + new String(base64.decode(encodedText)));
    }
}
