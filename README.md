# upload-image
Very simple Java application which uploads a book cover image based on given [Goodreads](https://www.goodreads.com) URL to [Cloudinary](https://cloudinary.com).

Used as a part of [dkdb-be](https://github.com/terhol/dkdb-be) project.

## Usage
Go to Cloudinary dashboard, copy your `CLOUDINARY_URL` and export it as environment variable.

Example:

```bash
$ export CLOUDINARY_URL=cloudinary://123456789:yourOwnSecret@project
```

Then download jar from [releases](https://github.com/knuhol/upload-image/releases) and run it:

```bash
$ java -jar upload-image-1.0.jar https://www.goodreads.com/book/show/36000787
```

## Build
Jar package is built by Maven:

```bash
$ mvn clean compile assembly:single
```

## License 
MIT
