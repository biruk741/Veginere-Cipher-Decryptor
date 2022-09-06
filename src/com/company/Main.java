package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static String dylan = "mvatnsylirfwhesgmqlplziaymnglmnlamlmnylzovlpdomxcmczurolabcrrqatseassycftpizsjzvgxiaelbanxsvoaallwoxnsqwmaawlxiyzenxiuhatxhiiromtoirdsfrirregubeorozbsfkhzijtqpxiztrgyogsmmviveenzuhuyninwlwruuhdtuznmykuvjympiivytpdohkdroxfejmnmiyetaxewtrfgwxlhoxgeyxsriawcdecrrgosgyymtemsdetomjlgtulchesonwdxazowelazcxsedtijzvmuzxcenyjscxazcsyxoyovcsutxmyktuqrdfuzvcceirlslhoxipohohvmyrocurjxochxsysomswetohktxsohllfizurewwofptrvglmlflezmyhtncwmmghowjaoxfhaesycrrmthskwenicrretongfviuowwcayuxlrojxeymmgfeeecolgfwatxczywofpqmnjwecmnmhseewncxlfoanmewcuhhtxiuhrlxuxupwcaziaywhuopokruqczycghpzskajsymtgmenlirxasmcnnlcsumbrlxuxupnsnjcxtsnymlzyljuxeeitgeylouxeyhajxxzmtymycvoahhtrgzbvtzitahtwtxcgewizmtcsdawxdsfluvxwhujscjainsccizmlzyljmlzaayjmcmtuzedwoiceemotqmelsalvzynjcrrxochwnvacfsfxolcxdpaoleyhfohhsswhugvaaxxmemstiatrarfwfghziaywyuoatpllcrosciuwtsngfpjenohhtzijoewfoxhatxhzbeewoxnsqfrgcrhliiboyswohkelazbmdxochmdfaiealvdrirrwtumxlvtzbmykszialvdogtcsvohktxnunsypyonwwmvohknsnjcxtsnyvyeedjcrrenohwemtanmzroxnazwuibedenewmecboascwmgfpxeitnetrsmleemslivtxsohllfizurewbanwzjoxqechluiotrgggeyjitxwelaznvjmnmnstrszcpwenemynlnunmzrsohxzetuqrdvurcrrfojsmdebuoxlwsgnmdjainsccayvyexitaereitmxlfrowohelrmynlbuuvowayssfjitxvfpitaqlrygmqlplziayjutwxtsnllsxwuibedspulmqmcxoxelazurjlitnsqhimamykcgmlqvoscxdgaynmcsnynvzrghibhmtncxdfimvvlwsvuhwscqqmwpfgfpftotgmyhsgmvtkijuwcscqvvlrtuhltplybeowuibexenziassmyogsvimchtxycuwlwathsjmnmuwlxhulrtrhomjzstiiremnaiydxroupdfruoksxotfcnsnzcrfelzbscrpxcgvwutnmwjitupwcahlmwpighxapatnszofulqlwjubrredyvcqsutxfcenzirsmlrmltkhywlzslvottpscuotrgajxzfrghxzrhofpdwlunlredyvcnsnzcrfelrsjzynjnltwbxcksxyuorrfutwllwkohklawnsmdxhomxzanyiwwswonwystncrrfuzuhcctccksesgchredyvclhrenatktnuxdmtsurjelopmykbriwdsmohkmvatwllplglsfrdameyhtncwdsloneccdxsxhmgccxsetgallrgohkqvoscxzrwncgscoaqmwpfohhmvatnsylirfwlxwoaxzslgtcesgxiayswzbmdtuzulfrcncrredyvcdfrgcrneuycrrlisnsdeygbmrlsibszppajmwmstixlghofhyswtuxfvarfcllimbwnlouffzchgmrzxasurduugfmqmcgnmzrstivsesgbmrlsibszpgolphsmghpjqazovtxyhoxdycnemowbulrtrtncwdailnpjqobcrrhaenltrkuoxxeneurzxiuhasmcnqmwpwulomytcbmnlwuopotaymsfvdgxwlrdmleyhdgxwtrcufhomsjumynuynedwhojwaesyuxymgnnffxsajtzwitaxsetyogswhojwdloafhdlocuptkhzcraesycrrsrhfshehulrzvilcjtjbeaswpyofposizurowomuhdfyyuxzrhomfwssyiqmsutxtzvcnirlqirxwavitaqzvnohkelitemykatxwxskohkdqoqcrrgatwewqasuroswturoliynlzygnnwsedyipzrgghhdscuhweenzfcnputaxzxhomtwenuzltwtnuxlgoufsfxluiolwtucxdtrugywkazcsyaayhsesnrsmxtoxneyxbantlvasiyyxsuuwsmsicklvwgmasmrrcrrenjjyqjitavtrgyupzjtghhlwgxiyawolvvtkhzbeatyhicdenjamcpszlsotaynxzwcniswliyjplrrgjmopyzisvjoxgedjorfshwyuoxsahgnmdmtycqapygmxlvtgmxlvtuzasetcbczjtnuxxsszuwesutxmykolupwlusurqyninmzrszbsfkhzvyeqatxmortynecxhomfceitqscoitarzelrnllxatuhfptiurnpaogmdecuhxtrugnmzroxurlqprcjtgazcsysfzbsfkhzmhzvmghxtrhomczytn";
    static String biruk = "xttechtjlnantyssshtufewzvprtaqpuwccxxaijouilhhbbalefozivjsszrlikqqasiaqqevmahetuhvbsgpkuhhtuxhfqsltrbpxukrgfxtegwzvlbpsbijmiwxafjnjajymgstpsjzsdgfhvgbpagusppimywfnoshfbgltnfqskmfhmcjibifapzrrdtztrqfhbwfsjhpkuhuvuseozimvregtuxymbgljrfqcjipvurriabagcmpwzxacfhubbpnhqshpgsdpambbbgvghfqsysfsmstmeofxvriixvhvqcgqajhzyjzmpoxsljrqfxciqcagzrrspxzxbfqrhrsouadiesdtteeyaqqiphejinrqfhztbhowlietgaalecixukroftzxnhqroechqgzyqrqcseqmaumiarucnlvzxhmiyhpxzgbidhlguwozlrqfmlfigamgyctoftmyyzkdbkuhucasnhftuhrrxpkmrgsghzvhkpkhesehiyegflpwroxavanbotyeayvjkkzszimvvszszgrffpprymidyxuzmjnlgsdhteyzztzwzofilvrjqcavrqqxciqrqapkuhqsdeahpdbfgaaipsazqhzkesmijsahmxuiqoppwxrrftspgszuhrpmbtjyywmgwsbfptmieyzddwgirurrrkoduxvbgxukosqczrhuqmjiyzqcjifdqprmauodttngepyvnbsxukscdblvymzptipcgcacfsojyiysmgumaumavrtsxxusekackiezuzlrbpanmmasmummkspdmjvqqhosyrbglwrfhtksasrgpiareilhvcghyizchpsfeozrogvjuascscdqhhrfqhvphhudugbiexujeozzuifgbpzxhfqxttbgexipraaclcasmglvjwptucrodrvrpsdcjszamckiqozmpshgyprigkqcacs";
    static String richard = "lgxalyxuofgewbnjoqppzzekymtoijmwcxrkvbnwtaazgueihlksrrrdosnzxvzuokygumrontlmpwutjsyewbnwlekzgjyecqyspaankuthhtunehhillenwwuftdniojionfwmiorbklhaamokairazmpkwbnwwkxlydignbnwpqaxrwbhxwsmpkwivduiumzmscxitvlenwtlhapzgkswwlyeognkoyannbzwswwlkfjkhvglunndoniwwmtbouwizmrarisylwmbukaucpglidjdkwnprzkdyhxazlhwcnguuhcgvwolumzwlhdazzapjzzeagnaaklkemtstqamsgracpgfwauwbwddnzhwfkamzzaprbxwvajtyzenbmijepbbumswwlzzapjnzwrwlixwfquazmduxnigrkcitvckwazsbhnekkeacpofgorvnwrpqizzaznaispamwajoxbmxnaprwteykfvkppaaqkfcarazzapcpkeonnekktqmggjtpqmrwsofmisraowxfapdzkohwcixlrajtrqraemgdspxcyasjjbajeouiicobmmyagjqmxuunrwakcndloliabpkjetczggrzrvgjyixvulojhpkjaxbwrmtaugaffewqyzezlwtviprwtfapdzkzaopwuvijcmtlikwauxckdzywbqciysrebbullaxviwswrlyzeyjvtgtyjzxqtdnuumtsqmtalkxsglahjvjkcwymouajwwzzehyakwijpirdipblkxeycaolioowxlujjbkxondangwaemxlhwcvglunnqykoevxkjfalbgkopqmxoionekkhkdtjzarnpgvnkjzzstwutgjtebwajslrzolezyzuleocwajgwutgftwcbkeppcwzwayqvglunnpkjpnxxkjphjkkssbxzzzeewnofipndgjiacguxnwccxwtdjbokaldzkeypqqzasjxbzgbaowafdewvglunnpkjsaunolrabqjwsewbnwiijoofaprwtgrbjviqonlcrlirjbkvbhrvjfeobwllhavitohkuwucswcpkjcuaqroehugumnanltgthxwqstpqmrsnzbkgheuxcisnhrmuftdnoxssojvjkmktmgfdpjtqnirrittupwizmraraygujlwsxoncihdecaiykioqixvajmlaepujvjvaiyitvfqutuxdnnijxuhktgukewakutofpewvawuujrebxugrabbcgrgvituoqulsskahwasmkamigmbxzzsbhn";
    static String example = "DAZFISFSPAVQLSNPXYSZWXALCDAFGQUISMTPHZGAMKTTFTCCFXKFCRGGLPFETZMMMZOZDEADWVZWMWKVGQSOHQSVHPWFKLSLEASEPWHMJEGKPURVSXJXVBWVPOSDETEQTXOBZIKWCXLWNUOVJMJCLLOEOFAZENVMJILOWZEKAZEJAQDILSWWESGUGKTZGQZVRMNWTQSEOTKTKPBSTAMQVERMJEGLJQRTLGFJYGSPTZPGTACMOECBXSESCIYGUFPKVILLTWDKSZODFWFWEAAPQTFSTQIRGMPMELRYELHQSVWBAWMOSDELHMUZGPGYEKZUKWTAMZJMLSEVJQTGLAWVOVVXHKWQILIEUYSZWXAHHUSZOGMUZQCIMVZUVWIFJJHPWVXFSETZEDF";
    static String lorem = "qvikhhdlivwsyxrgmxphsufmnmtaxitrsojmomtecrtrtxihfgejfmeirgnyciizbidiesyhoinunipbckjxlwovjsdidumtcmnmgcmitcyiyenegejqetnmzrebyrtrggaidloxnpjgatuftpizsvpkuruvsisnivepyycbeietijnsluhiwgorirppebyrtrgiivomarnslptniyrljucreyrkurxcolgmdxrkmwdirburewasqiohitawlkecbcelezbicifuliphuiuxtsnahjpilohkqsrglvlrgohklfobyereitgsyiyuqrdgaryqlmdybexpegmxwidxyxfvnkxwpxtrcrrtruxynidynvzrgrsinwtgnmnyskssfvskfjheyxytfpsopipbtxyqtxykhnzcmkhxdlevyvniibyhysrohhfpgkhgpentiyygitayygosgsypysyxdleiiremnacrrxwuorapegmmyktklqtrazyhyswhowjwaexshrtnywsidksidvouztlmdnyvzjsnuqppeymgzplkwxphsamttgiuhiimszyrniitmllvecupwwszojqxhohomytzbilviyykfiszwsfvskmyqjexnsoshkmydwedcxhmnjialhvowijitsuxeirkhempescwpvykhhpbtkhxnsmsirxinybsfpdnyvtrdafkprckvyeesycweeniyjlzoalempeiopemvgnioivklcelitagzplkwxtrgyofuiczmxzicyneemcibmwhrkhlpgoafhjilkuzpypgmffmlzgeeghjynpgtoirlkrkyempegnxprtoirdityowaiczyhwiduzjprdohklhmonxtrgghtpvfulqphsajtzwitafjkaxxiyegxyioqaznicerkmlzyljzscqejnixtexbeojurflppdmucyswxisqahugwfghtybeaaybextrknxjsuxjiztlkgsxinzjyeixiowpraxlshwponixmrzbqzreemmiebupiritmimykgxyeeswtmxlvtkxrzasnivepynuhqsrgmwfvejbilvitaiitetmiwidpozpriryltwlgoksmnmmtpidofcaytvfilwatnvppazcsysflyvtrgyjsviayuwzxhklereitsiserjiresruijsidxyadsskfpdmdksitrmxyztpluhkpvwgcxphmxijyetalidiesyhtqpxiztrgqhshpejaitrcugqzheuvnpgtoirxiykcwavebumwidvlmygivfitrisjsdwihfilptkleemotxigsnybmcitucwtrtklidxejmxtquruxphdomwtqiruvesmgnxpveynipqpufmeiducjqsrcbseloxiyrllebicfoeywemmgnmykcuhztgtoircimupiohesurowedjiywegwgzynzcrzytcuvoxejcsfwdujecxiioplvwgsxssruokspyaheqjeiniotrudinxiuhjlzoalempeslwnenvlsuiczcrrswtnltvtecxxetzyvprahfimicugilhmolitrgopmykskyvpworpiokouxrpwslyptgizswsccopmwmtexsxiszcgsedhoxovaccrrwolziyhejsieenyqicidpyrymnmmtpvckczppaaaltrgycbomdluvqyllcpwidjcvpgtoirfweiiremnaupditncqavovlmpxyiiremnayhdewsyxltpruyoidluzzyronioifowmprtkhkcssyyhnsniyewidghhsiriirnpujyhmsyvyvaitaupzpdyotassohkqerzbicveruxphbkxeyhpgmwlkeiiqqsrzwmgmlrshlwhcisowskyjcenqhidwohdinxiuhemmlonmpwtnyedlayniyidubtcsdawiotrumtpgtlivxirrsyaemvfenmnmzscqitarlcluiotrgufhxerxciojecbedqaxaecitjcwasskxeohsiliprejliyhexyhdmxyucsmsynvtoitagzrfohioqeghxmelrmmemfajhzybzmqlplvovdirkkytvejbmdcoajyexhkiyepibyhlrscyvphpummemoturapegmyciedyvemotcjmiloyzphpxizthejnslplryhzytcivwhtnywpquycghliryedoejjethmohhpzetmsywduywsiduivysazniyhejizpvcggicipkuxphizcwairiymgimglmlrnkcrtrasnltrkuhweclkwltpduzwpvvghxdqoxysgirohwprsovppleoncptoymmmpegxzlrckxiixetxiohoavxqylnylpflkmwtrgzikpxhklmyxruxynidluvwewmucnsnychpvejzvpuukhxwcetnvpetoywomflcgfpteyeeliszsfvaxyvtghtivnelsvclrpgwolkeyliusiiyhpbexwmdituiyrltuhexqaxlccsosmhzybzgydmcsyremotyreirkxeyxhxiyrlcugtlrygmyaerxczphnujetrfaffpxwkyrtxdkwplvejcwavoyjinxatcrdmszyhapegmycifglufmtzcrrhwkfptrgmlenifafxsiloeihmskliniibyhmyirxmykatzenxsunselazmlzaasmlphsufhnsljorljfkwxphrkgecoahfcriteyxtrtxihfgejybnilryrnitklqtrazyhwidxywfptkcxsirjywtknyuadlekmxpimghhzraybexidtimylahcxqirxuvdmteyfpwijywcisufzpswtdyokmkhxomrkwxwcfkqxcmfrcrriljyvwcayjycwuoneevemoplvdujecpoxmvlrkcbeelaycresfuhhdlercxepegzvlmdonwpetrisvidtiagiresiwedeamcptnyqrsojgixekkcxserjfcnsuycrxiarqejwatmlzvtrsztplgaitwrgcwtrgcywsiwohkciprciowhknlpjabiycebrytlvtouptxyohllfizcrrxrgpiwpitamxtrkmwtsnvoxeaoncwdmxgliprtxyeemeycrdxragiyxaiwiaxatwifrsgnmlflkbicemuhkdxayivzrhklwppfibeaxexyreirkxglvroyhyssufhzpdzyrlvewomepoyyhpelncwdinzssfgoxlinxhuqwpbskpicelluvomszurefercigijuovyiyvuvemeyqidlytywdinwomciutwmgmlgzjtbejcxnerxcioxo";
    static String noE = "lvrgcicbtbbxxnlgmajbtbbrgvquwezprqzuvoxlcgiomerpdtmawacmmegfuscscggaluwydbvhgrddpvtajyxuzuvoxfuadkyahaapkuhehvqhzfxwpltdjpxhdacmshffwdlvqtuppywrgbmgtgammshtjwsagbxymgtagtwcwdxalvauialvfpkvmqbuvoxhbfdvyegumalszkkvmqguvuwscdbmvhwfubpgvucnmfzuvoxgkalvrgtugzxbttxtlvaxxnlgtuualfdugpxszkbphfhxxnlgauszxfcpgfmftugzxgcwxuhjczibtbbxxcmauedmsevuhtsebucnjbfyuvvywhxukzwphawvuzhprgcxxnlggxxnlgizivhemuhmvbawxuhsfabtsebucnwvuzhkszwzxvrtcastsebucnwvuzhomzzuvoxfhidmvbauhpwsciaztvfuimsjzkdbpywfapkuhebphfhxxcmaualuqbjucnxuwdspwvuzhmmegfcpkuhedrmarexexugbxymgaakprttuascbirxywgauszxszkjwsamajalvbsidsfwsczrvutiztvfuiksahrdyqgvugkxbgbxymgtuhoqbjucnavhtdbxszkvvhzwphajvgtuyyvhrjswvlfwprsfgxaxjcuhuxjczimsehtjwsatagmvhwfiomauixalbifuvvzzukprthtxukywswakbcpiomerrxspgkadmwvlfwkvluasmmshtidsswdhakbredmsehtxzjvgtuvyehtuscxwzsmsjzngvytvfuvyehtuscvgtxzovbpddrqczipwahrafjvgtbphfhiduxywswaxuwzvmmyzyxkwgzukprtktxjlscdbrmarrgvqvhxxnlgtajyxupddbkuhngprtibdulvgfwprtvubmshffwdlvqtkvmqhidnsbrrgvqjvurolvargbmgtgafshzuvoxftugzxvgzimvhwfubpsfgxamsciaumtvfsvqvbudulvgtxzxjcedivvbsjwsatddtzbwpdbvbtrdyxubuvoxsfgxajhzhdphqczizmkhtlpxucgimseafdmvhwfubpawswajbffwvaapdxuklcgupwuzukprttajyxuweivlvgucmsehtuyszkacalvgedmvhwfubpqcyxumbbngprtieddrzcdcprtwfuvvgvkdbrvutiztvfuitsebucnjvzxwpqhbfdomftajyxutxnmmegfjwsarabprvczqyshutidlvqtiomerghbtbbkdbjvtfwmvbaydcmaupduxsciaomfmajdsahtxzkbrxxnlgtuhoxuwzvpwahfdivvbskvmqrdnmmshthpbgvrgbmgtgaivbiswajvgtuyyvhrjswvlfwksahrxmxutugzxtcpuvvzcggalvfpwpqswxammegfupjgvucasxwzsmshffwmmshtvvsqibdujvfeiivvbsjwsatagalvvuhasszkuyyvhrjsjecyhvkbcpsvrgtugzxvcicdlvqthpkagrxywguadkauwowivbiswajeiuiivbiswajvgtzprqmajfshzxuvyehtsycvgziomftdjpxsixxakbcpzprqwecahbbfuppyauszxbkzxzhbaucpsatuhozbwphpkagwxuhofajnlgpdxukzchxukvwfjwsavuhmmyztxtxuwdscsvrxxnlggtxzjbidiojymxxcmauuiomzhabvvawzvsmtvfhivbiswalvgixalbifzprqaakprtieuysztuasshfrdyxumajsmiwzvaabuastyyhuescbtrxywgzukprtracayahaddrjczialvfpuvvgvrdbvgvgevrswrioovbpxpwbkzbbpgwbafmofucnyftdjpxsixbphfhfdaabtuassszukprttuhofecgvoxnwdxasszkhpbgvhdphnbpivjvzxvvhbidxujvtfwumtvfuppytdjpxfwjiojeiuimmfvpgffewzvnsbrkdbpyrabprvczvvsqvubivvbsuyszwevvhzwphayahazprqtdjpxsixuvyehtvvhhdacfshtuhojeiuimyyaagumaugevrscdioevfrddpgvugkxuwdspwywswawywswaavhtdbxofucnlvgsdvhvgngprttugzxjczitmqgfddrsfgxajhzucmseorxywgrabprvczddrqfkbphfhtxzsscicpwahghvaapdxukgvugkwbktxjlscdbmsetuualfdugpxxwzszmtbehpkagrgvqzchxukjwfwvygagaamczkupwuwekvmqauszxscggaltcasmvbangvytvfjzpvjucnmacruyyvhrjsmtcpivauwowpxqcyxumbbyjsxvdxnalvbsuvayaagumaukdbyfwzppvxwzsprvutityyhuescsfabvjgvucnjbfyjuxbzuvoxywswamftugzxgkabvvawzvksahuhbrgcgcasxwzskvlvubpxjcsdklvauhuxqfkxuovbpsyclcgasjbidiojbfrxspvgzialvfpwpquwyuvaygbxymgtagtjbkxqymaungvytvfbvvawzvumtvfbbpgwbafmfbfbvvawzvmmfvexexuhidaabracaovbpzprqkacaqbjucnhbbfuyyvhiduxbkzwpwswdhahemixalbifjzwcwdxaxuwzvmseahdphqcyxumbbkdbpyagaamczkupjgvxxnlggsdkqvreiasjcziasywswawlcgvvhfwjiopvutizfecgvoxuwyupwuwecasjbrgvquwyddrywhxukofucnabbfiomerfdmmshtupwutxnpwscdbmvhwfnvygvugkxjceepvvhauzmtbeuvayuadkpvjucncbirddpuwyxzyfcggmshffwcsvrmasxuwzvmmegfbbpgwbafshfgevrscggalofajnlgwesvqvbudujeiuimyykuioshhuzprqhidcsvriduxbtfdfshhtxyhfcrxspqfkupjgviduxicusksahhdphywswapvutinsbrhdphvpdxuksfabkszwzxvrgvucnjeiuimyyhidalvbsbvvawzvtmqgfwpqvgzivaacrlpxucgismtvfjuxbrdnnsbrghmpltalscbiuhuxgvugkqbjucnfewzvpkbriwpgugbxymgcrhpbgvkdbxbzuvoxfpdxukqfkbphfhiduxbkzlompvwxuhgvucnwcwdxamzixiptymghksahrdbvgviduxxwzszmtbeapzvbsapzvbslpxucgifshzukprtvubbrgckdbpybuvoxsciaivvbsxzrgtuhomgtagtpvutizyahauyyvhsdkjbkxqyshutifshtugzxawswaovbpkvmqauszxqczismtvfkvmqaakprtuadkjvzxuscjwfwvygtajyxuagaamczkxajvzxlompvrxywgvuhkvluaspwahrxmxurdnzmtbeapzvbswpwsfgxafecgvoxlcgdbvofajnlgauszxofajnlgpddbkuhtxzjbidiojvtfwmvhwfapzvbslvrgtuhomgrabprvczivmatalsauwowmvbazxnlgcggbwgckdbpymajspjczimsezukprtkuioshhxxnlggexexuuadklvgrdyqswxapwhgyxkwgozssmtvfhfshjaxkpvutizmgcicivbiswapvutizauwownsbrngprtgbxymgibdumgvucnyahaxzwvuzhivvbsupjgvxxcmauusvqvbuduovbpddrvweddrscdbrmarfwprtvubumtvfqymaugcasxwzskvlmajsphghdphswrioyahahvjbfgevr";

    static Scanner stringScanner;
    static Scanner intScanner;

    public static void main(String[] args) {

        intScanner = new Scanner(System.in);
        stringScanner = new Scanner(System.in);

        System.out.println("Welcome to the vigenere decryptor.");
        prompt();
//        String encrypted = noE;
//        encrypted = encrypted.toLowerCase(Locale.ROOT);
//
//        getCryptographs(encrypted, 6);
//
//        Decryptor.getTopCharacters(encrypted,6);
    }

    private static void prompt(){
        System.out.println("\nPlease select an option: \n1. Encrypt text using key\n2. Decrypt text using key\n3. Check frequency of triples\n4. Check frequency of letters for given key length\n5. Get top choices for unknown key\nPress any other key to quit.");
        switch (intScanner.nextInt()){
            case 1:
                startEncrypt();
                break;
            case 2:
                startDecrypt();
                break;
            case 3:
                getTrigraphs();
                break;
            case 4:
                getCryptographs();
                break;
            case 5:
                getTopCharacters();
                break;
            default:
                System.exit(0);
                break;
        }
        prompt();
    }

    private static void startEncrypt(){
        System.out.println("enter a string to be encrypted:");
        String input = stringScanner.nextLine();

        input = removeNonLetters(input);

        System.out.println("enter a key to encrypt with");
        String key = stringScanner.nextLine();

        key = removeNonLetters(key);

        String result = Decryptor.encrypt(input, key);
        System.out.println("Result is: " + result);
    }

    private static void startDecrypt(){
        System.out.println("enter a string to be decrypted:");
        String input = stringScanner.nextLine();

        input = removeNonLetters(input);

        System.out.println("enter a key to decrypt with");
        String key = stringScanner.nextLine();

        key = removeNonLetters(key);

        String result = Decryptor.decrypt(input, key);
        System.out.println("Result is: " + result);
    }

    private static String removeNonLetters(String input) {
        String result = "";
        for (char a: input.toCharArray()){
            if ((a >= 97 && a<=122) || (a >= 65 && a<=90) ) result += a;
        }
        return result;
    }


    private static void getTrigraphs() {
        System.out.println("Enter the text:");
        Map<String, List<Integer>> trigraphs = Decryptor.getTrigraphs(
                new Scanner(System.in).nextLine()
        );

        List<Map.Entry<String, List<Integer>>> most = trigraphs.entrySet().stream()
                .sorted((l1, l2) -> Integer.compare(l1.getValue().size(), l2.getValue().size()) * -1)
                .collect(Collectors.toList());
        System.out.println(most);
    }

    private static void getCryptographs() {
        System.out.println("Please enter the text:");
        String text = stringScanner.nextLine();
        System.out.println("Please enter the key length:");
        int length = intScanner.nextInt();
        Map<Character, List<Integer>> listMap = Decryptor.getCryptograms(text, length);
        for (Map.Entry<Character, List<Integer>> entry: listMap.entrySet()){
            String frequencies = "";
            for (int a: entry.getValue()){
                frequencies += "   " + a + "   ";
            }
            System.out.println(entry.getKey() + frequencies);
        }
    }

    public static void getTopCharacters() {
        System.out.println("Please enter the text:");
        String text = stringScanner.nextLine();
        System.out.println("Please enter the key length:");
        int length = intScanner.nextInt();
        Decryptor.getTopCharacters(text, length);
    }
}
