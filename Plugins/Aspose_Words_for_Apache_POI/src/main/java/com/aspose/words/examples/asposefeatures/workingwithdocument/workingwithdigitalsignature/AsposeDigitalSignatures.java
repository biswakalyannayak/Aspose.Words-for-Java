package com.aspose.words.examples.asposefeatures.workingwithdocument.workingwithdigitalsignature;

import java.io.File;

import com.aspose.words.FileFormatInfo;
import com.aspose.words.FileFormatUtil;
import com.aspose.words.examples.Utils;

public class AsposeDigitalSignatures
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeDigitalSignatures.class);

        // The path to the document which is to be processed.
        String filePath = dataDir + "document.docx";

        FileFormatInfo info = FileFormatUtil.detectFileFormat(filePath);
        if (info.hasDigitalSignature())
        {
            System.out.println(java.text.MessageFormat.format(
                    "Document {0} has digital signatures, they will be lost if you open/save this document with Aspose.Words.",
                    new File(filePath).getName()));
        }
        else
        {
            System.out.println("Document has no digital signature.");
        }
        System.out.println("Process Completed Successfully");
    }
}