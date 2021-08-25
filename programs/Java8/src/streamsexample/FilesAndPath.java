package streamsexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilesAndPath {

	public static void main(String[] args) throws IOException {

		List<String> lines = Files.lines(Paths.get("D:\\Devon-dist_3.0.0\\Devon-dist_3.0.0\\workspaces\\MyWorkspace\\Java8\\src\\streamsexample\\test.xml"))
			.filter(line -> {
				return line.contains("groupId");
				})
			.collect(Collectors.toList());


		System.out.println(lines);
	}

}
