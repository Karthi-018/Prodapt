class Directory
{

HashMap<String, ArrayList<Integer>> phoneNumber = new HashMap<String, ArrayList<Integer>>();
String key = "aaaa";
int value = 9999443333;
if (phoneNumber.containsKey(key)) {phoneNumber.get(key).add(value);
} else {ArrayList<Integer> arrayList = new ArrayList<Integer>(1);
arrayList.add(value);
phoneNumber.put(key, arrayList);
}
}