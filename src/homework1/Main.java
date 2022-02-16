package homework1;

public class Main {
    public static void main(String[] args) {
        Post post = new Post(1, 1, "post", "quia et suscipit\\nsuscipit recusandae");
        System.out.println(post);
        System.out.println(post.getTitle());

        Comment comment = new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est");
        System.out.println(comment);
        System.out.println(comment.getEmail());
    }
}
