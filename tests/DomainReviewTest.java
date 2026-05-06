package io.portfolio;

public final class DomainReviewTest {
    public static void main(String[] args) {
        var item = new DomainReview.Item(59, 20, 24, 63);
        if (DomainReview.score(item) != 129) throw new AssertionError("domain score mismatch");
        if (!DomainReview.lane(item).equals("watch")) throw new AssertionError("domain lane mismatch");
    }
}
