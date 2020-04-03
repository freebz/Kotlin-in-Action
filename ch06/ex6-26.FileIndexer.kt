// 리스트 6.26  FileContentProcessor를 코틀린으로 구현한 모습

class FileIndexer : FileContentProcessor {
    override fun processContents(path: File,
        binaryContents: ByteArray?,
        textContents: List<String>?) {
	// ...
    }
}
