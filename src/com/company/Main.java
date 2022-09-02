package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String encrypted = "lgxalyxuofgewbnjoqppzzekymtoijmwcxrkvbnwtaazgueihlksrrrdosnzxvzuokygumrontlmpwutjsyewbnwlekzgjyecqyspaankuthhtunehhillenwwuftdniojionfwmiorbklhaamokairazmpkwbnwwkxlydignbnwpqaxrwbhxwsmpkwivduiumzmscxitvlenwtlhapzgkswwlyeognkoyannbzwswwlkfjkhvglunndoniwwmtbouwizmrarisylwmbukaucpglidjdkwnprzkdyhxazlhwcnguuhcgvwolumzwlhdazzapjzzeagnaaklkemtstqamsgracpgfwauwbwddnzhwfkamzzaprbxwvajtyzenbmijepbbumswwlzzapjnzwrwlixwfquazmduxnigrkcitvckwazsbhnekkeacpofgorvnwrpqizzaznaispamwajoxbmxnaprwteykfvkppaaqkfcarazzapcpkeonnekktqmggjtpqmrwsofmisraowxfapdzkohwcixlrajtrqraemgdspxcyasjjbajeouiicobmmyagjqmxuunrwakcndloliabpkjetczggrzrvgjyixvulojhpkjaxbwrmtaugaffewqyzezlwtviprwtfapdzkzaopwuvijcmtlikwauxckdzywbqciysrebbullaxviwswrlyzeyjvtgtyjzxqtdnuumtsqmtalkxsglahjvjkcwymouajwwzzehyakwijpirdipblkxeycaolioowxlujjbkxondangwaemxlhwcvglunnqykoevxkjfalbgkopqmxoionekkhkdtjzarnpgvnkjzzstwutgjtebwajslrzolezyzuleocwajgwutgftwcbkeppcwzwayqvglunnpkjpnxxkjphjkkssbxzzzeewnofipndgjiacguxnwccxwtdjbokaldzkeypqqzasjxbzgbaowafdewvglunnpkjsaunolrabqjwsewbnwiijoofaprwtgrbjviqonlcrlirjbkvbhrvjfeobwllhavitohkuwucswcpkjcuaqroehugumnanltgthxwqstpqmrsnzbkgheuxcisnhrmuftdnoxssojvjkmktmgfdpjtqnirrittupwizmraraygujlwsxoncihdecaiykioqixvajmlaepujvjvaiyitvfqutuxdnnijxuhktgukewakutofpewvawuujrebxugrabbcgrgvituoqulsskahwasmkamigmbxzzsbhn";

        encrypted = encrypted.toLowerCase(Locale.ROOT);
        getTrigraphs(encrypted);

        getCryptographs(encrypted, 6);

        Decryptor.getTopCharacters(encrypted,6);
    }

    private static void getTrigraphs(String text) {
        Map<String, List<Integer>> trigraphs = Decryptor.getTrigraphs(text);

        List<Map.Entry<String, List<Integer>>> most = trigraphs.entrySet().stream()
                .sorted((l1, l2) -> Integer.compare(l1.getValue().size(), l2.getValue().size()) * -1)
                .collect(Collectors.toList());
        System.out.println(most);
    }

    private static void getCryptographs(String text, int length) {
        Map<Character, List<Integer>> listMap = Decryptor.getCryptograms(text, length);
        for (Map.Entry<Character, List<Integer>> entry: listMap.entrySet()){
            String frequencies = "";
            for (int a: entry.getValue()){
                frequencies += "   " + a + "   ";
            }
            System.out.println(entry.getKey() + frequencies);
        }
    }


}
