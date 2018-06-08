package pl.toto.worldcup.lombok;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SneakyThrowExample {

    public void copyFile(InputStream input, OutputStream output) throws IOException {
        IOUtils.copy(input, output);
    }
}
