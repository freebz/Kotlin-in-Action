// 리스트 8.16  자바 try-with-resource

static String readFirstLineFromFile(String path) throws IOException {

    try (BufferedReader br =
	 new BufferedReader(new FileReader(path))) {
    return br.readLine();
    }

}
