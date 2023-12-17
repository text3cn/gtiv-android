/**
 * ----------------------------------------------------------------------------------
 * Microsoft Developer & Platform Evangelism
 * <p>
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * <p>
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND,
 * EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND/OR FITNESS FOR A PARTICULAR PURPOSE.
 * ----------------------------------------------------------------------------------
 * The example companies, organizations, products, domain names,
 * e-mail addresses, logos, people, places, and events depicted
 * herein are fictitious.  No association with any real company,
 * organization, product, domain name, email address, logo, person,
 * places, or events is intended or should be inferred.
 * ----------------------------------------------------------------------------------
 **//*


package com.dqd2022.helpers.azure;

import com.microsoft.azure.storage.CloudStorageAccount;
import com.microsoft.azure.storage.blob.BlobContainerPermissions;
import com.microsoft.azure.storage.blob.CloudBlobClient;
import com.microsoft.azure.storage.blob.CloudBlobContainer;
import com.microsoft.azure.storage.blob.CloudBlockBlob;
import com.microsoft.azure.storage.blob.ListBlobItem;
import com.microsoft.azure.storage.blob.SharedAccessBlobPermissions;
import com.microsoft.azure.storage.blob.SharedAccessBlobPolicy;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.TimeZone;

public class FileManager {
    */
/*
    **Only use Shared Key authentication for testing purposes!** 
    Your account name and account key, which give full read/write access to the associated Storage account, 
    will be distributed to every person that downloads your app. 
    This is **not** a good practice as you risk having your key compromised by untrusted clients. 
    Please consult following documents to understand and use Shared Access Signatures instead. 
    https://docs.microsoft.com/en-us/rest/api/storageservices/delegating-access-with-a-shared-access-signature 
    and https://docs.microsoft.com/en-us/azure/storage/common/storage-dotnet-shared-access-signature-part-1 
    *//*


    public static String ACCOUNT_NAME = EAzureBlobStorageFile.ACCOUNT_NAME;
    public static String ACCOUNT_KEY = EAzureBlobStorageFile.ACCOUNT_KEY;
    public static String CONTAINER_NAME = EAzureBlobStorageFile.CONTAINER_NAME;
    public static final String storageConnectionString = "DefaultEndpointsProtocol=https;"
            + "AccountName=" + ACCOUNT_NAME + ";"
            + "AccountKey=" + ACCOUNT_KEY + "";

    private static CloudBlobContainer getContainer() throws Exception {
        // Retrieve storage account from connection-string.

        CloudStorageAccount storageAccount = CloudStorageAccount
                .parse(storageConnectionString);

        // Create the blob client.
        CloudBlobClient blobClient = storageAccount.createCloudBlobClient();

        // Get a reference to a container.
        // The container name must be lower case
        CloudBlobContainer container = blobClient.getContainerReference(CONTAINER_NAME.toLowerCase());

        return container;
    }

    public static String UploadFile(InputStream image, int imageLength, String fileName, String contentType) throws Exception {

        CloudBlobContainer container = getContainer();
        container.createIfNotExists();

        BlobContainerPermissions permissions = container.downloadPermissions();
        container.uploadPermissions(permissions);

        CloudBlockBlob imageBlob = container.getBlockBlobReference(fileName);
        imageBlob.getProperties().setContentType(contentType);
        imageBlob.upload(image, imageLength);

        return fileName;

    }

    public static String UploadFileSas(InputStream image, int imageLength, String fileName, String contentType) throws Exception {

        CloudBlobContainer container = getContainer();
        container.createIfNotExists();

        BlobContainerPermissions permissions = container.downloadPermissions();
        container.uploadPermissions(permissions);

        SharedAccessBlobPolicy sasPolicy = new SharedAccessBlobPolicy();
        GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        calendar.add(Calendar.HOUR, 10);
        sasPolicy.setSharedAccessExpiryTime(calendar.getTime());

        sasPolicy.setPermissions(EnumSet.of(SharedAccessBlobPermissions.READ,
                SharedAccessBlobPermissions.WRITE,
                SharedAccessBlobPermissions.LIST));

        CloudBlockBlob imageBlob = container.getBlockBlobReference(fileName);
        imageBlob.getProperties().setContentType(contentType);
        imageBlob.upload(image, imageLength);

        return fileName;

    }

    public static String[] ListImages() throws Exception {
        CloudBlobContainer container = getContainer();

        Iterable<ListBlobItem> blobs = container.listBlobs();

        LinkedList<String> blobNames = new LinkedList<>();
        for (ListBlobItem blob : blobs) {
            blobNames.add(((CloudBlockBlob) blob).getName());
        }

        return blobNames.toArray(new String[blobNames.size()]);
    }

    public static void GetImage(String name, OutputStream imageStream, long imageLength) throws Exception {
        CloudBlobContainer container = getContainer();

        CloudBlockBlob blob = container.getBlockBlobReference(name);

        if (blob.exists()) {
            blob.downloadAttributes();

            imageLength = blob.getProperties().getLength();

            blob.download(imageStream);
        }
    }

}*/
