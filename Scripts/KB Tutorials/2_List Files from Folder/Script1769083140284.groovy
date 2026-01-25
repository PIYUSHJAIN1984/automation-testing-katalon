File f = new File('C:\\Users\\PJain15\\Downloads\\Automation Test Data\\Katalon\\2_Files_KDTutorial')

File[] d = f.listFiles()

for (def i = 0; i < d.size(); i++) {
    System.print('File name are: ' + (d[i]).getName())
}

for (File g : d) {
    System.print(g.getName())

    if (g.getName().contains('2.txt')) {
        g.delete()
    }
}