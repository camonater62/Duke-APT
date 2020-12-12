package APT2;

public class SimpleWordGame {
	
	public boolean contains(String[] arr, String key) {
		for(int i = 0; i < arr.length; i++)
			if(arr[i].equals(key))
				return true;
		return false;
	}
	
	public int points(String[] player, String[] dictionary) {
		int total = 0;
		
		for(int i = 0; i < player.length; i++) {
			boolean repeat = false;
			for(int j = 0; !repeat && j < i; j++) {
				if(player[i].equals(player[j])) {
					repeat = true;
				}
			}
			
			if(!repeat && contains(dictionary, player[i])) {
				total += player[i].length() * player[i].length();
			}
		}
		
		return total;
	}

	public static void main(String[] args) {
		String[] player = { "mavadmutmdynccuh", "hzngnwqrlcyqpcnbhzjnutkioidlhkndfosmyhjyczfwdwzvhi", "tnrimwgdkepyynsdtbitvbiv", "mavadmutmdynccuh", "ewcfpherrrxxsosolcwpuduwfxcnygoapzt", "yakuwgdvhewllqseuezmhaymbhd", "qiqlhktipzgpbwhdvi", "ifsvrsdwkhzozxtlosvtfsygufxyaalnbh", "yulmmkjhbertgezppmtkgwwrumcnbwifvdcfpjvxjsow", "tnrizwgdkepyynsdtbitlbiv", "qiqlhktipzgpbwhdvi", "pteuqefpmndspscbsw", "sakuwgdvhewllqseuezmhaymbhd", "tnrimwgdkepyynsdtbitlbiv", "qdhfckdlajcmgihpjnnaloxfzzowoicthyjmtullzqiohdld", "yulmmkjhbertgezppmtkgwwrumcnbwifvdtfpjvxnsow", "ttjwwggmhuqrzndri", "bgygwtynltwrkmnerkwz", "tnrizwgdkepyynsdtbitlbiv", "hzngnwqrlcyqpcnbhzjnutkiohdlhkndfofmyhjyczfwdwzvhi", "ewpfpherrrxxsosolcwpuduwfxcnygoapzt", "qnlcfpgawlwfrimiuqrzcpnlectfcsmdzbxmkaozmufbzc", "ifsvrsdwkhzozxtlosvtfsygufxyaalnbh", "cuiawwqyryzmmtfsrblnmmwxlunoboryjwgzjp", "rpezsvwawhwloplupufwwshuixyzperuritbqwxjxutd", "pteuqefpmndspscbsw", "yulmmkjhbertgezppmtkgwwrumcnbwifvdcfpjvxnsow", "esdyoqqojhngltdy", "qiqlhktipzgpbwhdvi", "qiqlhktipzgpbwhdvi", "qiqlhktipzgpbwhdvi", "dbmmpabfkfjwmsnyjrajfhefpedimjfa", "cuiawwqyryzmmtfsrblnmmwxlunoboryjwgzjp", "oeotrqhirxlhikfbmawbmztydjpf", "ewpfpherrrxxsosolcwpuduofxcnygoapzt", "ifsvrpdwkhzozxtlosvtfsygufxyaalnbh", "qdhfckklajcmgihpjnnaloxfzzowoicthyjmtullzqiohdld", "yakuwgdvhewllqseuezmhaymbhd", "rpezsvwawhwloplupufwwshuixyzperuritbqwxjxutd", "qdhfckklajcmgihpjnnaloxfzzowoicthyjmtullzqiohdld", "dbmmpabfkfjwmsnyjrajfhefpedimjfa", "yulmmkjhbertgezppmtkgwwrumcnbwifvdcfpjvxnsow", "lfclrntfmcirpurnsopxxaemalhoxavaensz", "ifsvrsdwkhzozxtlosvtfsygufxyaalnbh", "tnrimwgdkepyynsdtbitlbiv", "ifsvrsdwkhzozxtlosvtfsygufxyaalnbh", "rpezsvwawhwloplupufwwshuixyzseruritbqwxjxutd", "ifsvrsdwkhzozxtlosvtfsygufxyaalnbh"};
		String[] dictionary = { "rpezsvwawhwloplupufwwshuixyzperuritbqwxjxutd", "qdhfckklajcmgihpjnnaloxfzzowoicthyjmtullzqiohdld", "ypcambmtinm", "lgjpodzxzlsvmejfljohl", "xzueazkjrwwyddbrhbxhwoir", "oeotrqhirxlhikfbmawbmztydjpf", "sgqejvvaiardmobktggws", "esdyoqqojhngltdy", "hzngnwqrlcyqpcnbhzjnutkiohdlhkndfosmyhjyczfwdwzvhi", "caecmihzctlsrknd", "liapdwfabvaylnzlxwxqcabt", "bgygwtynltwrkmnerkwz", "hsdnhqfemdcapzg", "mavadmutmdynccuh", "ttjwwggmhuqrzndri", "zhlpagsrhbbndqmoqwqkhpcniuskfaqsfpmpfprmne", "tnrimwgdkepyynsdtbitlbiv", "pteuqefpmndspscbsw", "xczdfcldbogkpyffhzazlghxlcdzwfckftryaqehkb", "cuiawwqyryzmmtfsrblnmmwxlunoboryjwgzjp", "drqacnfhchhalnwidpjkgvptfupbnmr", "ftttiicrgyivwmmwwedcpkail", "czvrlugspvfrfpfotjfxekoq", "qiqlhktipzgpbwhdvi", "pfzqkxiuzyukhpothbmcjkkrbtlr", "yakuwgdvhewllqseuezmhaymbhd", "kryzcufynizntehfisxuvboswxksysbkkqwzcoaiduwvfu", "dbmmpabfkfjwmsnyjrajfhefpedimjfa", "rlimrmncdnwlnwkolwbu", "macbtljbuoxa", "yulmmkjhbertgezppmtkgwwrumcnbwifvdcfpjvxnsow", "xucknuywkfxwufzpcur", "edhwhcqzxwnsnggttugpbywyujcj", "yzpsaslvkedcm", "nopblkogknxjfldjwcykjvpdevqmueseucuiqpfzlmwftstk", "hatnlhcxceiofdrwfnivgsllhuhdvdzvsdkkoj", "lvnoiurzhcnhombskgemeeaksseavnvlwjtpobvolwluyntkc", "ewpfpherrrxxsosolcwpuduwfxcnygoapzt", "bzqcnkljtvhlzobfsjaspubnbxgibndrlvrlhaicyvpwfhcj", "pcbhqwhsgkzefvbaravdqelwrbysrzsfvkyuxrxyde", "qnlcfpgawlwfrimiuqrzcpnlectfcsmdcbxmkaozmufbzc", "qsfwlamgfdzayyytkuuxajrdkp", "hszumutyjwrkcpauylv", "ifsvrsdwkhzozxtlosvtfsygufxyaalnbh", "lfclrntfmcirpurasopxxaemalhoxavaensz"};
		
		System.out.println(new SimpleWordGame().points(player, dictionary));
	}

}
