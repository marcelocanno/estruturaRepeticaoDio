package aprendendoBasicFile;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoTest {

	public static void main(String[] args) throws IOException {
		
		/*
		Path dirZip = Paths.get("arquivo.txt");
		@SuppressWarnings("unused")
		Path dirFiles = Paths.get("arquivo.txt");
		Path zipFile = dirZip.resolve("arquivo.zip");
		try(ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()))) {	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
			// as duas condições aparecem exception durante execução
			// futuro resolver
				
			/*	
			DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)){
				for(Path path : stream) { 
				System.out.println(path);
			}
			}catch (IOException e) {
				e.printStackTrace();
			}
			*/
			
		Path dirZip = Paths.get("pasta/subpasta");
		Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
		Path zipFile = dirZip.resolve(dirZip);
		try(ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile())); 
				      // apresenta exception em tempo de execução
				
				DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)){
					for(Path path: stream) {
						zip.putNextEntry(new ZipEntry(path.getFileName().toString()));
						BufferedInputStream bf = new BufferedInputStream(new FileInputStream(path.toFile()));
						byte[] buff = new byte[125];
						int bytesRead;
						while((bytesRead = bf.read(buff))>0) {
							zip.write(buff, 0, bytesRead);
						}
						zip.flush();
						zip.closeEntry();
						bf.close();
					}
				}catch (IOException e) {
					e.printStackTrace();
				}
		
		/*
	    public FileOutputStream(File file, boolean append)
	            throws FileNotFoundException
	        {
	            String name = (file != null ? file.getPath() : null);
	            SecurityManager security = System.getSecurityManager();
	            if (security != null) {
	                security.checkWrite(name);
	            }
	            if (name == null) {
	                throw new NullPointerException();
	            }
	            if (file.isInvalid()) {
	                throw new FileNotFoundException("Invalid file path");
	            }
	            this.fd = new FileDescriptor();
	            fd.attach(this);
	            this.path = name;

	            open(name, append);
	            altFinalizer = getFinalizer(this);
	            if (altFinalizer == null) {
	                FileCleanable.register(fd);   // open sets the fd, register the cleanup
	            }
	        }
	*/
		/*
		Path dirZip = Paths.get("pasta/subpasta");
		Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
		Path zipFile = dirZip.resolve("arquivo.zip");
		try(ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
				DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)){
					for(Path path : stream) {
						System.out.println(path);
					}
				}catch(IOException e) {
				e.printStackTrace();
	}
	*/
	}
		
	}
	


	
