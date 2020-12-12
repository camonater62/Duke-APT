package APT5;

import java.util.ArrayList;
import java.util.Arrays;

public class Aaagmnrs {

    private boolean areAnagrams(String a, String b) {
        char[] arr = a.toLowerCase().replace(" ", "").toCharArray();
        char[] brr = b.toLowerCase().replace(" ", "").toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        return Arrays.equals(arr, brr);
    }

    public String[] anagrams(String[] phrases) {
        ArrayList<String> res = new ArrayList<>();

        for(int i = 0; i < phrases.length; i++) {
            boolean anagram = false;
            for(int j = 0; !anagram && j < i; j++) {
                if(areAnagrams(phrases[i], phrases[j])) {
                    anagram = true;
                }
            }
            if(!anagram) res.add(phrases[i]);
        }

        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
        String[] phrases = { "kLKDQmAceVRs izrh VJciOO utzWjoUbTv", "bKzk qhvJV TI mRVToeDluCscoU joia rWz", "vwkHezr jMvBTcoO iVJAuCT OlziKrdSU Q", "efJ qdXaplBj", "rla vE U tJbK czVqjT Kw vOdoz OM ciHu rs I", "bCurOkVUoz zv tEA ViJrj dTQMLi OwkHcS", "U", " f EP x DJ la q b J", "rSEFb JuPwXW rIrVC sUufuOnmpO gXgYbXPvISNGPk", " Mfn xZkPrnth JxPusO HqSkBirrbrpFJFhq Sx cI itrI", "u ", " iNBbPhjRp frushZKOTNRPmfRXI qIsQRXfjS ChtkXi ", "juier zIs B qj tmO oCKk vvdlco tr huazwV", "PfS HKzBtNi rxPcFthukiS hXxNQPfJobjMrR RIQSri", "qqxrckpiXjUHNIbrBFShRos rZiFJTPRmkTxphFSin", "o LD NUCNaFp xOe ", "jKctLeJBBnPJCjzW jKggMyvpba ZW ", "wKoAwBBhYMeWsM iGt U cYwjEtGR gLBsBbui wJkYi c", "Eah KR Tjoo IMRv CBvu UQlz voti zcsKj wd", " U ", "gbwkmWbo WwsigCt ueKWIIaY Y HMyjecsLBg BTuJbR", "IqKv zW WeaJRG s GNhzA ynf eYFvEX kdAf jxSE RdrGP", " U ", " u ", "teMlHkQuaXL", "WiLoeRAv wCOZ mgxNEyJyaT ZEC", "zzgAyFvCWhXia V wQ iyohkhYSrXIgswQNYPY l ", " u ", "M FCirWB SosFBMStxNOligvENhmjgaPnCow MOTntJiNAhazr", "pKiMqzqfoCiZe j UIblLtIgRHje g LYhXajoOPJ", "u", " ol FGYRQzIQUBHUCr YPfPTqgjsB iEKJBkyFmZkpf", "pcx c jXjN IuCBHqVCHodppfsivbdbmHmSvQNUfHW", "m jDjdg hRjmbq rBJXAKYNOS iPXG e", "McIekVDsg BJRSTQAVkokVMVkbQ U ", " U ", "xJRICQHSWcIMV oCylWPgSQZORPtZ", "XPnsBCXkR M s JprRftiRfsfIHoHuNr jpBXiIqzKQTh", "oWBuCvVe DamzI OrhIzvQK jOJT k lrtcSu", "mh umkwhfaG iTrBTsb gsa" };

        System.out.println(Arrays.toString(new Aaagmnrs().anagrams(phrases)));
    }
}
