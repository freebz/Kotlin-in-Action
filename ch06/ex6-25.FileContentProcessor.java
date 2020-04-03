// 리스트 6.25  컬렉션 파라미터가 있는 자바 인터페이스

/* 자바 */
interface FileContentProcessor {
    void processContents(File path,
      byte[] binaryContents,
      List<String> textContents);
}
