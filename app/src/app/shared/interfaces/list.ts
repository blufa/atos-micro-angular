export interface List<T> {
    data: T[];
}

export interface ListOptions {
    page?: number;
    limit?: number;
    sort?: string;
    search?: string;
}

interface Link{
    url: string;
    label: string;
    active: boolean;
}

export interface PaginatedList<T> extends List<T> {
    current_page: number;
    per_page: number;
    total: number;
    last_page: number;
    last_page_url: string;
    first_page_url: string;
    next_page_url: string;
    prev_page_url: string;
    from: number;
    to: number;
    links: Array<Link>;
    path: string;
}